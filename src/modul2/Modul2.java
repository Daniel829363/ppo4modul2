/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;
import java.io.File;
/**
 *
 * @author Acer
 */
public class Modul2 {

     public static void main(String[] args) {

        // определяем объект для каталога
        File dir = new File("D://Документы//ППО 4//files");
        // если объект представляет каталог
        if(dir.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : dir.listFiles()){

                if(item.isDirectory()){

                    System.out.println(item.getName() + "  \tкаталог");
                }
                else{

                    System.out.println(item.getName() + "\tфайл");
                }
            }
        }
    }
}
