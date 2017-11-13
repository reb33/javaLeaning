package certification2.champter8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationCheck  {

    //конструкторы при десериализации не вызываются
    //def инициатор при десериализации не вызывается
    public static void main(String[] args) {
        File file = new File("objects.data");
//        List<SerializationClass> list = new ArrayList<>();
//        list.add(new SerializationClass(12,"12", 'D',12));
//        list.add(new SerializationClass(22, "22", 'V',22));
//        writeObj(list, file);

        System.out.println(readObjects(file));
    }

    static void writeObj(List<SerializationClass> list, File file){
        try(ObjectOutput objectOutput = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))){
            for (SerializationClass sClass : list ){
                objectOutput.writeObject(sClass);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static List<SerializationClass> readObjects(File file){
        List<SerializationClass> list = new ArrayList<>();
        try(ObjectInput objectInput = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true){
                try{
                    Object obj = objectInput.readObject();
                    if (obj instanceof SerializationClass){
                        list.add((SerializationClass) obj);
                    }
                }catch (EOFException e){
                    break;
                }
            }
        }catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
        return list;
    }
}
