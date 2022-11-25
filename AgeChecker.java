Scanner sc = new Scanner (System.in);
int idade = 0;
char holdLicence;
System.out.println("Insira a sua idade");
idade = sc.nextInt();
System.out.println("Você possui uma carteira de habilitação?");
holdLicence = sc.next().charAt(0);
if ((idade>20)&& (holdLicence>16)){
    System.out.println("Você é adulto e dirige um carro");        
    }
           
else {
    System.out.println("Você não é adulto e não dirige um carro");
}
sc.close();
}    
}
