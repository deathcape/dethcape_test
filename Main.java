import java.io.*;
public class Main {
	    public static void main(String[] args) {
	        try{
	            FileReader f = new FileReader("20120825_lostfound.txt");
	            BufferedReader b = new BufferedReader(f);
	            String s;
	            int i;
	            i=1;
	            String Sub_s;
	            String Sub_s_1="";
	            while((s = b.readLine())!=null){
	            	if (i%50==6 || i%50==7) {
	            		if (i%50==7){
	            			String Sub_s1=s.substring(39,51);
	            			String Sub_s2=" 2012 ";
	            			String Sub_s3=s.substring(s.length()-15);
	            			Sub_s=Sub_s_1+" "+Sub_s1+Sub_s2+Sub_s3;
	            			Sub_s_1="";
	            			File file = new File("Lostfound_out.txt");
	            			FileWriter filewriter = new FileWriter(file,true);
	            			BufferedWriter bw = new BufferedWriter(filewriter);
	            			PrintWriter pw = new PrintWriter(bw);
	            			pw.println(Sub_s);
	            			pw.close();
			                System.out.println(Sub_s);
	            		}else{
		            		Sub_s_1=s;
		            		}
	            		
	            	}
	            	i++;
	            	
	            }
	        }catch(Exception e){
	            System.out.println("ÉtÉ@ÉCÉãì«Ç›çûÇ›é∏îs");
	        }

	    }

	}
