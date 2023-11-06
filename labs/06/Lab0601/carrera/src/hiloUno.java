
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.plaf.SliderUI;


public class hiloUno extends Thread{

    
    public hiloUno(String name) {
        this.setName(name);
    }//constr
    
    public void run(){
        
        
    
        if(getName().equals("Carro Ichi")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCarro1.setLocation(frmInicio.lblCarro1.getLocation().x+carrera.losCaballos[0].getAvance(),frmInicio.lblCarro1.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[0].getVelocidad());
                    
                    if(frmInicio.lblCarro1.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[0].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[0].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
            
            frmInicio.lblCarro1.setLocation(frmInicio.lblCarro1.getLocation().x,frmInicio.lblCarro1.getLocation().y);
             
             this.stop();
        }//if
              
        
        if(getName().equals("Carro Ni")){
            long ti=System.currentTimeMillis();
for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCarro2.setLocation(frmInicio.lblCarro2.getLocation().x+carrera.losCaballos[1].getAvance(),frmInicio.lblCarro2.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[1].getVelocidad());
                    
                    if(frmInicio.lblCarro2.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[1].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[1].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
             frmInicio.lblCarro2.setLocation(frmInicio.lblCarro2.getLocation().x,frmInicio.lblCarro2.getLocation().y);        
        this.stop();
        }//if
        
        if(getName().equals("Carro San")){
            long ti=System.currentTimeMillis();
          for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCarro3.setLocation(frmInicio.lblCarro3.getLocation().x+carrera.losCaballos[2].getAvance(),frmInicio.lblCarro3.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[2].getVelocidad());
                    
                    if(frmInicio.lblCarro3.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[2].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[2].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
             frmInicio.lblCarro3.setLocation(frmInicio.lblCarro3.getLocation().x,frmInicio.lblCarro3.getLocation().y);                
        this.stop();
        }//if
        
        if(getName().equals("Carro Yon")){
            long ti=System.currentTimeMillis();
          for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCarro4.setLocation(frmInicio.lblCarro4.getLocation().x+carrera.losCaballos[3].getAvance(),frmInicio.lblCarro4.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[3].getVelocidad());
                    
                    if(frmInicio.lblCarro4.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[3].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[3].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
             frmInicio.lblCarro4.setLocation(frmInicio.lblCarro4.getLocation().x,frmInicio.lblCarro4.getLocation().y);                
        this.stop();
        }//if
        
    }//run

    
   

        
    }//class