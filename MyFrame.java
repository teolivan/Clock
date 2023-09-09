
//import libraries
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Calendar;


public class MyFrame extends JFrame {

    //Initialization of vars 
    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String day;
    String time;
    String date;

    //Object constructor
    MyFrame() {

        //set UI display
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);


        //format time,day & date display
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("dd MMMMM, yyyy");

        //set UI display style
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
       timeLabel.setOpaque(true);

        //set day UI display
       dayLabel = new JLabel();
       dayLabel.setFont(new Font("Arial", Font.PLAIN, 30));

       //set date UI display
        dateLabel = new JLabel();
       dateLabel.setFont(new Font("Arial", Font.PLAIN, 25));

        //add labels time,day & date to MyFrame object
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        //method call
        setTime();
    }

    //method get and set time, day & date
    public void setTime() {
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

               day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

             date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            //update every 1000ms
            try {
            Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        
    }
}