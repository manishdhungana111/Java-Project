import java.awt.*;
import java.awt.event.*;
//import java.applet.*;
import java.lang.Math;
import java.util.*;
import javax.swing.*;

import java.io.*;
//import java.applet.*;

import java.awt.event.MouseMotionListener;

/*<applet code="break12.class"  width=1250 height=700>
</applet>*/

class Global
{
    public static int lives=3;
    public static boolean pause=false;
    public static int pa=0,gun=0,gungun=0,power=0,gun1=1,xg=0,flash=0;

}


class blocks extends Applet

{ 	 public int second = new GregorianCalendar().get(GregorianCalendar.SECOND);
    Color c1=new Color(100,100,100);
    Color c2=new Color(200,150,100);
    Color c3=new Color(100,50,200);
    Color c4=new Color(10,155,199);
    public int minute = new GregorianCalendar().get(GregorianCalendar.MINUTE);
    public int rows,x,x2,y2,x1,x3,y3,y1,fla=0,fslow=0,fslow1=0,y,t,w=60,tempX,tempY,score, highscore,flives=0,flives1=0,fnoliv=0;//lives=3;
    public int flagover=0,count=0,level=1,x5,y5,fpause=0,x6,y6,x10,y10;
    public int sp=0,sp1=0,x4,y4,yg;
    private boolean[][] blockArray;
    private boolean down = true,start = false,g=false;
    private double angle = 0;
    public blocks(int rrows)
    {
        int i, ii;
        rows = rrows;

        blockArray = new boolean[10][rows];

        for (i = 0; i != 10; ++i)
        {
            for (ii = 0; ii != 10; ++ii)
            {
                blockArray[i][ii] = true;
            }
        }


    }



    public Graphics drwMap(Graphics back,int width, int height,int m,boolean started)
    {
        int n=0;
        if(!start) start = started;
        //theva=getImage(getDocumentBase(),"baby6.jpg");
        //back.drawImage(theva,0,0,width,height);
        int i, ii,j,second2=0,lives1=2,pa=0;
        back.setColor(Color.black);
        back.fillRect(0,0,width,height);
        if(Global.power==10)
        {
            Global.flash=5;System.out.println("jai mata di");
        }
        if(Global.power>=1)
        {
            if(Global.power<=10)
            {back.setColor(Color.white);
                back.fillRect(0,0,width,height);
                Global.power++;
                if(Global.power%2==0&&Global.power!=0)
                {
                    back.setColor(Color.black);
                    back.fillRect(0,0,width,height);
                }
            }
        }
        back.setColor(Color.red);

        for (i = 0; i !=10 ; ++i)
        {
            for (ii = 0; ii != rows; ++ii)
            {
                tempX = i * 100 + 10;//distance of blocks from the screen
                tempY = ii * 30 + 50;

                if (blockArray[i][ii] && start&&!Global.pause)
                {
                    if(yg>=tempY&&yg<=tempY+30&&Global.xg>tempX+5&&Global.xg<tempX+100&&Global.gun1==1)
                    {
                        blockArray[i][ii]=false;
                        Global.gun1=0;
                        Global.gun=0;
                        yg=800;
                        score++;
                    }
                    if (y >=tempY && y <= tempY + 30 && x >= tempX + 1 && x < tempX + 100)
                    {
                        blockArray[i][ii]=false;
                        down = !down;
                        score++;

                        if( i==2&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            Global.gun=1;

                        }
                        if(i==5&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            flives=1;

                        }
                        if(i==3&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            flives1=1;

                        }
                        if(i==6&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            fnoliv=2;
                        }
                        if(i==4&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            fslow1=2;
                        }
                        if(i==7&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            fslow=1;

                        }
                        if(i==8&&ii==8)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            sp=1;

                        }
                    }

                    if (y >=tempY && y <= tempY + 30 && x >= tempX  && x <= tempX + 10 && angle  > 0)
                    {
                        angle = angle * -1;
                        blockArray[i][ii] = false;
                        score++;

                        if(i==2&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            Global.gun=1;

                        }
                        if(i==5&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            flives=1;

                        }
                        if(i==3&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            flives1=1;

                        }
                        if(i==6&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            fnoliv=2;
                        }
                        if(i==4&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            fslow1=2;
                        }
                        if(i==7&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            fslow=1;

                        }
                        if(i==8&&ii==8)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            sp=1;

                        }
                    }
                    if (y >=tempY && y <= tempY + 30 && x >= tempX + 100 && x <= tempX + 110 && angle  < 0)
                    {
                        angle = angle * -1;
                        blockArray[i][ii] = false;
                        score++;

                        if(i==2&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            Global.gun=1;

                        }
                        if(i==3&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            flives1=1;

                        }
                        if(i==5&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            flives=1;

                        }
                        if(i==6&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            fnoliv=2;
                        }
                        if(i==4&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            fslow1=2;
                        }
                        if(i==7&&ii==9)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            fslow=1;

                        }
                        if(i==8&&ii==8)
                        {
                            blockArray[i][ii]=false;
                            back.fillRect(tempX,tempY+50,90,20);
                            sp=1;

                        }
                    }


                    if(y5 == height - 20 &&( x5+15 >= m -40 || x5+15 <= m + 40)&&Global.gun==1)
                    {
                        //score=score+1;
                        if(Global.flash==0)
                            Global.power=1;
                        Global.gun1=0;
                        yg=800;
                        Global.gungun=1;
                    }
                    if(y1 == height - 20 && (x1+15 >= m -40 || x1+15 <= m + 40)&&flives==1)
                    { 	score=score+5;
                        flives=0;
                        Global.lives++;
                        Global.power=1;
                    }
                    if(y10 == height - 20 && (x10+15 >= m -40 || x10+15 <= m + 40)&&flives1==1)
                    { 	score=score+5;
                        flives1=0;
                        Global.lives++;
                        Global.power=1;
                    }

                    if(y6 == height - 20 &&( x6+15 >= m -30 || x6+15 <= m + 30)&&fslow1==2)
                    {              score=score+5;
                        fslow1=0;

                        Global.lives--;

                        Global.power=1;
                    }
                    if(y2 == height - 20 && (x2+15 >= m -30 || x2+15 <= m + 30)&&fnoliv==2)
                    {              score=score+5;
                        t=Global.lives;
                        fla=1;
                        fnoliv=0;
                        w=w+30;
                        Global.power=1;
                    }

                    if(y3 == height - 20&& (x3+15 >= m -30 || x3+15 <= m + 30) &&fslow==1)
                    {          score=score+5;
                        fslow=0;
                        Global.lives--;
                        Global.power=1;
                    }
                    if(y4 == height - 20&&( x4+15 >= m -30 || x4+15 <= m + 30) &&sp==1)
                    {           score=score+5;
                        sp=0;sp1=1;
                        Global.power=1;
                    }

                }

                if (blockArray[i][ii]&&!Global.pause)
                {
                    if(i==4&&ii==9&&!start)
                    {
                        back.fillRect(tempX,tempY,90,20);
                        x6=tempX;
                        y6=tempY;
                    }
                    else if(i==5&&ii==9&&!start)
                    {
                        back.fillRect(tempX,tempY,90,20);
                        x1=tempX;
                        y1=tempY;
                    }
                    else if(i==3&&ii==9&&!start)
                    {
                        back.setColor(c3);
                        back.fillRect(tempX,tempY,90,20);
                        back.setColor(Color.yellow);
                        x10=tempX;
                        y10=tempY;
                    }
                    else if(i==6&&ii==9&&!start)
                    {
                        x2=tempX;
                        y2=tempY;
                        back.fillRect(tempX,tempY,90,20);
                    }
                    else if(i==7&&ii==9&&!start)
                    {back.fillRect(tempX,tempY,90,20);
                        x3=tempX;
                        y3=tempY;
                    }
                    else if(i==8&&ii==8&&!start)
                    {
                        x4=tempX;
                        y4=tempY;
                        back.fillRect(tempX,tempY,90,20);
                    }
                    else if(i==2&&ii==9&&!start)
                    {
                        x5=tempX;
                        y5=tempY;
                        back.fillRect(tempX,tempY,90,20);
                    }
                    else
                    {
                        //back.fillRect(tempX,tempY,90,20);
                        if(i==1&&ii!=0&&ii!=9)
                            back.setColor(Color.yellow);
                        else if(i==3&&ii!=1&&ii!=0&&ii!=9&&ii!=8)
                            back.setColor(Color.yellow);
                        else if(i==1&&ii==0||i==2&&ii==1||i==1&&ii==9||i==2&&ii==8||i==2&&ii==0||i==3&&ii==1||i==2&&ii==9||i==3&&ii==8)
                            back.setColor(Color.yellow);
                        else if(ii==0&&(i==6||i==7||i==8)||ii==1&&(i==6||i==7||i==8))
                            back.setColor(Color.yellow);
                        else if(i==7)
                            back.setColor(Color.yellow);
                        else if(i==6&&(ii==8||ii==9)||i==5&&ii==8||i==5&&(ii==9||ii==7))
                            back.setColor(Color.yellow);
                        else
                        {back.setColor(c3);
                        }


                        back.fillRect(tempX,tempY,90,20);

                    }
                }
            }
        }




        if (y >= height - 20 && x+5 >= m -45&& x+5 <= m + 45&&fla==0)  //when ball hits the paddle
        {

            angle = (x - m-1) / 5;  //change of angle
            down = false;   // ball goes up after contact



        }
        if (y >= height - 20 && x+5 >= m -45 && x+5 <= m + 45&&fla==1)  //when ball hits the paddle
        {

            angle = (x - m-1) / 5;  //change of angle
            down = false;   // ball goes up after contact



        }




        if (y >= height && x+5 < m -45 | x+5 > m + 45&&fla==1)  //when it misses the paddle
        {
            Global.lives--;
            fla=0;
            y = height - 30;
            fla=0;

            sp=0;
            fslow=0;
            flives=0;
            flives1=0;
            fnoliv=0;
            fslow1=0;
            angle = -1;
            Global.pa=0;
            start = false;
            Global.power=0;
            Global.gun1=0;
            Global.gun=0;
            Global.gungun=0;
            yg=800;
            down = false;
            if (Global.lives == 0)
            {

                start=!start;
                flagover=1;
                down=true;
                for (i = 0; i != 10; ++i)
                {
                    for (ii = 0; ii != rows; ++ii)
                    {
                        blockArray[i][ii] = true;
                    }
                }
                score = 0;
                Global.lives = 4;
                pa=1;

            }

        }


        if (y >= height && x+5 < m -30| x+5 > m + 30&&fla==0)  //when it misses the paddle
        {
            Global.lives--;
            sp1=0;
            y = height - 30;
            angle = -1;
            start = false;
            fla=0;
            sp=0;
            fslow=0;
            flives=0;
            flives1=0;
            Global.pa=0;
            Global.power=0;
            fnoliv=0;
            fslow1=0;
            Global.gun1=0;
            Global.gun=0;
            Global.gungun=0;
            yg=800;
            down = false;
            if (Global.lives == 0)
            {

                start=!start;
                down=true;
                flagover=1;
                for (i = 0; i != 10; ++i)
                {
                    for (ii = 0; ii != rows; ++ii)
                    {
                        blockArray[i][ii] = true;
                    }
                }
                score = 0;
                Global.lives = 4;
                pa=1;

            }

        }


        if (x <= 0 | x >= 1010) angle = angle * -1; // ball hits the side of the frame
        if (y <= 0)down = true; // ball hits the top of the frame

        if (start && sp1==0&&!Global.pause)
        {

            x=x+(int)angle;  // the travelling of ball in x direction
            if (down)
                y = y + 3; // travellin in y direction
            else y = y - 3;
            if(yg<=0)
            {yg=800;
                Global.gun1=0;
            }
            yg=yg-5;
            if(Global.gun==1)
            {
                y5=y5+1;
                back.setColor(Color.white);
                back.fillRect(x5+40,y5,20,20);
                back.drawString("get gun",x5+70,y5+10);
            }
            if(flives==1)
            {
                back.setColor(Color.white);
                y1=y1+1;
                back.fillRect(x1+40,y1,20,20);
                back.drawString("get life",x1+70,y1+10);
            }
            if(flives1==1)
            {
                back.setColor(Color.white);
                y10=y10+1;
                back.fillRect(x10+40,y10,20,20);
                back.drawString("get life",x10+70,y10+10);
            }

            if(fnoliv==2)
            {
                back.setColor(Color.white);
                y2=y2+1;
                back.fillRect(x2+40,y2,20,20);
                back.drawString("big paddle",x2+70,y2+10);
            }
            if(fslow1==2)
            {
                back.setColor(Color.white);
                y6=y6+1;
                back.fillRect(x6+40,y6,20,20);
                back.drawString("lose life",x6+70,y6+10);
            }

            if(fslow==1)
            {
                back.setColor(Color.white);
                y3=y3+1;
                back.fillRect(x3+40,y3,20,20);
                back.drawString("lose life",x3+70,y3+10);
            }
            if(sp==1)
            {
                back.setColor(Color.white);
                y4=y4+1;
                back.fillRect(x4+40,y4,20,20);
                back.drawString("increase speed",x4+70,y4+10);
            }


        }
        else if(start&& sp1==1&&!Global.pause)
        {
            x=x+(int)angle;  // the travelling of ball in x direction
            if (down)
                y = y + 5; // travellin in y direction
            else y = y - 5;
            if(yg<=0)
            {yg=800;
                Global.gun1=0;
            }
            yg=yg-5;

        }

        else if(start)
        {
            x=x;  // the travelling of ball in x direction
            if (down)
                y = y ; // travellin in y direction
            else y = y ;
            back.setFont(new Font("thomba",Font.BOLD,20));
            back.setColor(Color.white);
            back.drawString("GAME PAUSED",400,300);

        }


        else   // the game is not started
        {
            x = m;
            y = height - 30;
            down = false;  //keeps the ball on the paddle
        }
        if(!start&&flagover==1&&Global.lives!=2&&Global.lives!=1)

        {
            //flagover=0;
            back.setColor(Color.white);
            back.setFont(new Font("thomba",Font.BOLD,20));
            back.drawString("GAME OVER...",300,500);

        }


        if (score > highscore) highscore = score;
        back.setColor(Color.red);
        back.fillRect(x,y,10,10);//ball
        if(Global.gun1==1)
            back.fillRect(Global.xg,yg,5,5);
        if(t==Global.lives)
            back.fillRect(m-30,height-20,90,10);// paddle
        else
            back.fillRect(m-30,height-20,60,10);// paddle
        back.setFont(new Font("times new roman",Font.BOLD,15));

        back.drawString("Score: " + score + "   Lives: " + Global.lives+ "   Highscore: " + highscore+"  Level:"+level,10,12);
        for(i=0;i<10;i++)
        {
            for(ii=0;ii!=10;ii++)
            {
                if(blockArray[i][ii]==true)
                {
                    count=1 ;
                    break;
                }
                count=2;
            }
            if(count==1)break;
        }
        if(count==2)
        {System.out.println("thev");
            for (i = 0; i != 10; ++i)
            {
                for (ii = 0; ii != 10; ++ii)
                {
                    blockArray[i][ii] = true;
                    level++;
                }
            }
        }
        return back;


    }

}

public class Main extends Applet implements MouseMotionListener, MouseListener,KeyListener
{
    Graphics backg;
    Image backimg, img;
    int x,y,m,width,height, milli,oldmilli;
    boolean started = false;
    blocks blockObj = new blocks(10);

    public void init()
    {
        width = getSize().width;
        height = getSize().height;
        backimg = createImage(width,height);
        backg = backimg.getGraphics();
        addMouseMotionListener(this);
        addMouseListener(this);
        addKeyListener(this);
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent ke){

    }
    public void keyPressed(KeyEvent ke)
    {int key=ke.getKeyCode();
        if(key==KeyEvent.VK_P)
        {
            if (Global.pause==true)
                Global.pause=false;
            else
                Global.pause=true;
        }
        if(key==KeyEvent.VK_SPACE)
        {
            if(Global.gun1==0&&Global.gungun==1)
            {Global.xg=m;
                Global.gun1=1;}
        }
    }


    public void mouseDragged(MouseEvent e){movePaddle(e); e.consume();}
    public void mouseMoved(MouseEvent e){movePaddle(e); e.consume();}

    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e)
    {

        started = true; repaint();
        e.consume();
    } //starts the game when mouse is clicked


    public void movePaddle(MouseEvent e)
    {

        m = e.getX(); // moves the paddle in x direction
        repaint();
        e.consume();
    }
    public void paint(Graphics g)
    {
        update(g);
    }
    public void update(Graphics g)
    {

        backg = blockObj.drwMap(backg,width,height,m,started);
        showStatus(" written by RUSHIL KHIMAVAT");

        if (started) started = false;
        g.drawImage(backimg,0,0,this);
        repaint();
    }
}