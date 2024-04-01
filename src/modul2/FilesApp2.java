/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

import java.io.File;
import java.io.IOException;

public class FilesApp2 {

    public static void main(String[] args) {

        // определяем объект для каталога
        File myFile = new File("D://Документы//ППО 4//files//sovetskoe.png");
        System.out.println("Имя файла: " + myFile.getName());
        System.out.println("Родительский каталог: " + myFile.getParent());
        if(myFile.exists())
            System.out.println("Файл существует");
        else
            System.out.println("Файл еще не создан");

        System.out.println("Размер файла: " + myFile.length());
        if(myFile.canRead())
            System.out.println("Файл доступен для чтения");
        else
            System.out.println("Файл не доступен для чтения");

        if(myFile.canWrite())
            System.out.println("Файл доступен для записи");
        else
            System.out.println("Файл не доступен для записи");

        // создадим новый файл
        File newFile = new File("D://Документы//ППО 4//files//5ozer");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("Файл создан");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}