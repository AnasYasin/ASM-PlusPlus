
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class progress extends JFrame{
    JProgressBar pb;
    public progress(){
        pb=new JProgressBar();
        pb.setBounds(50, 50, 250, 30);
        pb.setValue(0);
        pb.setStringPainted(true);
        this.add(pb);
        this.setSize(450,450);
        this.setLayout(null);
    }
    public void update(){
        int i=0;
        while(i<101){
            pb.setValue(i);
            i++;
            try {
            Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }    
        }
    }
    public static void main(String[] args)throws Exception {
        progress pd=new progress();
        pd.setVisible(true);
       pd.update();
        
        
    }
}
