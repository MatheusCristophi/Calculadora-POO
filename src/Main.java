public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Operacao operacao = new Operacao();

    System.out.println("Digite um numero que deseja fazer o calculo: ");
    operacao.num1 = scan.nextInt();

    System.out.println("Digite outro numero que deseja fazer o calculo: ");
    operacao.num2 = scan.nextInt();

    System.out.println("Qual operação vc desejaria realizar? + - * /");
    operacao.op = scan.next();

    switch (operacao.op){
        case "+" :
            System.out.println((operacao.num1 + operacao.num2));
            break;
        case "-" :
            System.out.println((operacao.num1 - operacao.num2));
            break;
        case "*" :
            System.out.println(operacao.num1 * operacao.num2);
            break;
        case "/" :
            System.out.println((operacao.num1 / operacao.num2));
            break;
        default :
            System.out.println("Opção invalida");
            break;
    }

}
