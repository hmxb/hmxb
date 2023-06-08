package addressBookListSingleton;

import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;

public class FileProc {
    private File file = null;

    public FileProc(String fileName){
        file = new File("f:\\tmp\\" + fileName + ".txt");

        try{
            if(file.createNewFile()){
                System.out.println("파일 생성 성공 !");
            }
            else{
                System.out.println("파일 생성 실패!");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public void write(){
        PrintWriter pw = new PrintWriter(new BufferedWriter(new Filewriter(file)));

        for(int i=0; i<s.addressList.size(); i++){
            pw.println(s.addressList.get(i).print());
        }
    }
}
