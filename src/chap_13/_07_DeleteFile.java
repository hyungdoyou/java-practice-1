package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("goodjob.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("파일 삭제 성공 : " + file.getName());
            } else {
                System.out.println("파일 삭제 실패 : " + file.getName());
            }
        }
        File folder = new File("A/B/C");
        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());  // A라는 폴더 밑에 B와 C폴더가 있어서 삭제 불가 -> A/B/C
            }
        }
//        public static boolean deleteFolder(File folder){
//            if (folder.isDirectory()) {
//                for (File file : folder.listFiles()) {
//                    deleteFolder(file);
//                }
            }
        }