public class Main {
    public static void main(String[] args) {

        // [A] 2 <= 2 && !true
        // [B] !false && 3 > 2
        // [C]: considering that t=false and f=true: !(!t || f)
        // [D]: 6 > 6 ^ !(true && true)

        boolean A = 2 <= 2 && !true; // (2 <= 2) && (!true)  = true && false = false


        boolean B = !false && 3 > 2; // (!false) && (3 > 2) = true && true = true


        boolean t= true;
        boolean f = false;
        boolean C = !(!t || f); //  !( (!t) || false) = !(false || false) = !(false) = true


        boolean D = 6 > 6 ^ !(true && true); // (6 > 6) false ^ !(true && true) false = false ^ false = false

        System.out.println("[A] = " + A + "\n[B] = " + B + "\n[C] = " + C + "\n[D] = " + D);



        }


           }
