/*
Burç Bulan Program
Java koşullu ifadeler ile kullanıcının burcunu bulan program yapımı.
*/
package Giris;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {

            int gun , ay;
            String burc = " ";
            boolean isError = false;
            Scanner inp = new Scanner(System.in);

            System.out.println("Dogdugunuz ay : ");
            ay = inp.nextInt();

            System.out.println("Dogdugunuz gun ");
            gun = inp.nextInt();

            if (ay > 0 && ay <= 12){

                if(ay==1) {
                    if (gun >= 1 && gun <= 31) {
                        if (gun < 22) {
                         burc = "Oglak";
                        } else {
                         burc="Kova";
                        }
                    }else {

                            isError = true;
                    }
                }

                if(ay==2) {
                    if (gun >= 1 && gun <= 29) {
                        if (gun <= 19) {
                            burc = "Kova";
                        } else {
                            burc = "Balik";
                        }
                    }else {
                        isError = true;
                    }
                }

                if(ay==3) {
                    if (gun >= 1 && gun <= 31) {
                        if (gun <= 20) {
                            burc = "Balik";
                        } else {
                            burc = "Koc";
                        }
                    }else {
                        isError = true;
                    }
                }



                if(ay==4) {
                    if (gun >= 1 && gun <= 30) {
                        if (gun <= 20) {
                            burc = "Koc";
                        } else {
                            burc = "Boga";
                        }
                    }else {
                        isError = true;
                    }
                }


                if(ay==5) {
                    if (gun >= 1 && gun <= 31) {
                        if (gun <= 21) {
                            burc = "Boga";
                        } else {
                            burc = "İkizler";
                        }
                    }else {
                        isError = true;
                    }
                }

                if(ay==6) {
                    if (gun >= 1 && gun <= 30) {
                        if (gun <= 22) {
                            burc = "İkizler";
                        } else {
                            burc = "Yengec";
                        }
                    }else {
                        isError = true;
                    }
                }

                if(ay==7) {
                    if (gun >= 1 && gun <= 31) {
                        if (gun <= 22) {
                            burc = "Yengec";
                        } else {
                            burc = "Aslan";
                        }
                    }else {
                        isError = true;
                    }
                }


                if(ay==8) {
                    if (gun >= 1 && gun <= 31) {
                        if (gun <= 23) {
                            burc = "Aslan";
                        } else {
                            burc = "Basak";
                        }
                    }else {
                        isError = true;
                    }
                }

                if(ay==9) {
                    if (gun >= 1 && gun <= 30) {
                        if (gun <= 23) {
                            burc = "Basak";
                        } else {
                            burc = "Terazi";
                        }
                    }else {
                        isError = true;
                    }
                }

                if(ay==10) {
                    if (gun >= 1 && gun <= 30) {
                        if (gun <= 22) {
                            burc = "Terazi";
                        } else {
                            burc = "Akrep";
                        }
                    }else {
                        isError = true;
                    }
                }


                if(ay==11) {
                    if (gun >= 1 && gun <= 30) {
                        if (gun <= 21) {
                            burc = "Akrep";
                        } else {
                            burc = "Yay";
                        }
                    }else {
                        isError = true;
                    }
                }
                if(ay==12) {
                    if (gun >= 1 && gun <= 30) {
                        if (gun <= 21) {
                            burc = "Yay";
                        } else {
                            burc = "Oğlak";
                        }
                    }else {
                        isError = true;
                    }
                }
  }




                System.out.println("Burcunuz " + burc);
    }
}
