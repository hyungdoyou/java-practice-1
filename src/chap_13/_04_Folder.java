package chap_13;

import java.io.File;
import java.sql.SQLOutput;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);

        folder.mkdir();
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }

        System.out.println("---------------------------");
        folderName = "A/B/C";   // A 폴더는 존재하지만 B, C 폴더가 없기 때문에 실패한다
        // File.separator + "B" + File.separator + "C";
        // 윈도우 : C : \\Users\\Nadocoding\\Desktop
        // 맥 : /Users/Nadocoding/Desktop

        folder = new File(folderName);
        folder.mkdirs();  // 하위에 여러개 폴더가 있는 폴더 생성 시 작성
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdir)");
        }
    }
}
