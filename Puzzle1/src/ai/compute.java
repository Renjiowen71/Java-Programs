
package ai;

/**
 *
 * @author ASUS
 */
public class compute {

    public static void main(String[] args) {
        int[][] target = new int[2][2];
        int[][] start = new int[2][2];
        
        start[0][0] = 1;
        start[0][1] = 3;
        start[1][0] = 0;
        start[1][1] = 2;
        
        target[0][0] = 0;
        target[0][1] = 1;
        target[1][0] = 2;
        target[1][1] = 3;
        
        Puzzle puz1 = new Puzzle(2,2,target, start);
        Puzzle puz2 = new Puzzle(2,2,target, start);
        Puzzle puz3 = new Puzzle(2,2,target, start);
        //int[][] target, start;
        
        int[] now;
        int sequenze;
        now = puz1.getnow();
        switch (now[0]+now[1]){
            case 0:
                sequenze = 1;
                break;
            case 2:
                sequenze = 3;
                break;
            default:
                if (now[0]==1)
                    sequenze = 2;
                else
                    sequenze = 0;
                break;
                
        }
        
        int sequenze2 = sequenze;
        puz2.printstart();
        puz2.printtarget();
        
        int i = 0;
        while ( puz1.finish() == false && puz2.finish() == false && i <13){
            switch (sequenze){
                case 0 :
                    puz1.up();
                    puz2.left();
                    break;
                case 1 :
                    puz1.right();
                    puz2.down();
                    break;
                case 2:
                    puz1.down();
                    puz2.right();
                    break;
                default :
                    puz1.left();
                    puz2.up();
                    break;
            }
            i++;
            sequenze = (sequenze+1)%4;
        }
        
        if(puz1.finish()){
            while (puz3.finish() == false){
                switch (sequenze2){
                    case 0 :
                        puz3.up();
                        break;
                    case 1 :
                        puz3.right();
                        break;
                    case 2:
                        puz3.down();
                        break;
                    default :
                        puz3.left();
                        break;
                }
                puz3.printprocess();
                sequenze2 = (sequenze2+1)%4;
            }
        }
        else if (puz2.finish()){
            while (puz3.finish() == false){
                switch (sequenze2){
                    case 0 :
                        puz3.left();
                        break;
                    case 1 :
                        puz3.down();
                        break;
                    case 2:
                        puz3.right();
                        break;
                    default :
                        puz3.up();
                        break;
                }
                puz3.printprocess();
                sequenze2 = (sequenze2+1)%4;
            }
            
        }
        else 
            System.out.println("Gagal");
            
        //int[] zero = new int[2];
        //int[] compute = new int[2];
        //int[] oppositezerotarget = new int[2];
        //int[] oppositezerostart = new int[2];
        //target = puz.gettarget();
        //start = puz.getstart();
        //zero = puz.findtarget(0);
        //if(zero[0] == 0)
        //    oppositezerotarget[0] = 1;
        //if(zero[1] == 0)
        //    oppositezerotarget[1] = 1;
        //oppositezerostart = puz.findstart(target[oppositezerotarget[0]][oppositezerotarget[1]]);
        
    }
    
}
