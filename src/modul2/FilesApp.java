/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;
import java.io.File;

public class FilesApp {

    public static void main(String[] args) {

        // определяем объект для каталога
        File dir = new File("D://Документы//ППО 4//files//steklomoy");
        boolean created = dir.mkdir();
        if(created)
            System.out.println("Каталог успешно создан");
        // переименуем каталог
        File newDir = new File("D://Документы//ППО 4//files//vino");
        dir.renameTo(newDir);
        // удалим каталог
        boolean deleted = newDir.delete();
        if(deleted)
            System.out.println("Каталог удален");
    }
}

