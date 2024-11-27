import java.util.Scanner;
class Esercizio {
    public static void main(String args[])
    {
      Scanner in = new Scanner (System.in);
      int i,n;
      System.out.prrint("inserire giri");
      n=in.nextInt();
      double h[]= new h[n];
      double v[]= new v[n];
      for (i=0;i<n;i++) {
        h[i]=in.nextDouble();
        v[i]=in.nextDouble();
      }
      double th,tv;
      th=0;
      tv=0;
      for ( i=0;i<n;i++) {
        th=th+h[i];
        tv=tv+v[i];
      }
      if(th<tv){
        System.out.print("il vincitore è hamilton") ;
      } else {
        System.out.print("il vincitore è verstappen") ;
      }
      double tminv, tminh;
      tminv=0;
      tminh=0;
      for(i=0;i<n;i++) {
        if ( h[i]<h[tminh]) {
            tminh=i;
        }
        if (v[i]<v[tminv]) {
            tminv=i;
        }
      } 
      if ( tminh<tminv) {
        System.out.println("tempo minimo hamilton");
      }  else {
        System.out.println("tempo minimo verstappen");
      }

    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md