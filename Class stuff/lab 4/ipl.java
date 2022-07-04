import java.io.*;
import java.util.*;
public class ipl {

  
	public static void main(String[] args) throws InterruptedException {

        HashMap<String, Integer> Winmap=new HashMap<String, Integer>();
		
		try
		{
            File obj = new File("leastwins.txt");
            File obj2 = new File("points.txt");
            InputStream input = new FileInputStream("iplstat.txt");  
            OutputStream output = new FileOutputStream(obj);
            OutputStream output2 = new FileOutputStream(obj2);
    DataInputStream inst = new DataInputStream(input);  
    int count = input.available();  
			byte team[] = new byte[3];
            byte won[]= new byte[2];
            int CSKwinner=0;
            int MIwinner=0;
            int RCBwinner=0;
            int DCwinner=0;
            int KKRwinner=0;
            int PKwinner=0;
            int RRwinner=0;
            int SRHwinner=0;
			while(inst.read(team)!=-1)
			{
				String str = new String(team);
                String b = str;
                if(b.equals("CSK"))
                {
                    inst.skip(2);
                    inst.read(won);
                    String str1 = new String(won);
                    int wcount= Integer.parseInt(str1);
                    CSKwinner= CSKwinner+wcount;
                }
                
                else if(b.equals("MI0"))
                {
                    inst.skip(2);
                    inst.read(won);
                    String str1 = new String(won);
                    int wcount= Integer.parseInt(str1);
                     MIwinner= MIwinner+wcount;
                }
                else if(b.equals("RCB"))
                {
                    inst.skip(2);
                    inst.read(won);
                    String str1 = new String(won);
                    int wcount= Integer.parseInt(str1);
                    RCBwinner= RCBwinner+wcount;
                }

                else if(b.equals("DC0"))
                {
                    inst.skip(2);
                    inst.read(won);
                    String str1 = new String(won);
                    int wcount= Integer.parseInt(str1);
                    DCwinner= DCwinner+wcount;
                }

                else if(b.equals("KKR"))
                {
                    inst.skip(2);
                    inst.read(won);
                    String str1 = new String(won);
                    int wcount= Integer.parseInt(str1);
                    KKRwinner= KKRwinner+wcount;
                }

                else if(b.equals("PK0"))
                {
                    inst.skip(2);
                    inst.read(won);
                    String str1 = new String(won);
                    int wcount= Integer.parseInt(str1);
                    PKwinner= PKwinner+wcount;
                }
                
                else if(b.equals("RR0"))
                {
                    inst.skip(2);
                    inst.read(won);
                    String str1 = new String(won);
                    int wcount= Integer.parseInt(str1);
                    RRwinner= RRwinner+wcount;
                }

                
                else if(b.equals("SH0"))
                {
                    inst.skip(2);
                    inst.read(won);
                    String str1 = new String(won);
                    int wcount= Integer.parseInt(str1);
                    SRHwinner= SRHwinner+wcount;
                }

                inst.skip(4);
                
            }

            Winmap.put("CSK",CSKwinner);  
            Winmap.put("MI0",MIwinner);  
            Winmap.put("DC0",DCwinner);  
            Winmap.put("RCB",RCBwinner); 
            Winmap.put("KKR",KKRwinner);  
            Winmap.put("PK0",PKwinner);  
            Winmap.put("RR0",RRwinner);  
            Winmap.put("SH0",SRHwinner);
            Thread thr1 = new Thread(new Runnable() {
                public void run() {                
            try{      
              
                int minwins = (Collections.min(Winmap.values()));
                DataOutputStream dout = new DataOutputStream(output);
                for(Map.Entry m : Winmap.entrySet()){ 
            
                if(m.getValue()==Integer.valueOf(minwins))
                {
                System.out.println(m.getKey()+": "+m.getValue());  
                String result= m.getKey().toString();
                dout.writeChars(result);  
                }     
                }     
                    
                dout.close();
            }
            catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    }
    });





    Thread thread2 = new Thread(new Runnable() {
        public void run() {                
    try{      
        DataOutputStream dout = new DataOutputStream(output2);
        for(Map.Entry m : Winmap.entrySet()){ 
        int points = 2*Integer.parseInt(m.getValue().toString());     
    
        if(points==66)
        {
        System.out.println(m.getKey()+": "+m.getValue());  
        String result2= m.getKey().toString();
        dout.writeChars(result2);  
        }     
        }     
            
        dout.close();
    }
    catch(Exception e)
{
    System.out.println(e.getMessage());
}
}
});


        thr1.start();
        thread2.start();

    }

        catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}