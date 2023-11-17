import espaciais.*;
import planas.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        int escolha1;
        int escolha2 = 0;
        Scanner input = new Scanner(System.in);


        System.out.println("\n" +
                "░█▀▄▀█ █▀▀ █▀▀▄ █──█ \n" +
                "░█░█░█ █▀▀ █──█ █──█ \n" +
                "░█──░█ ▀▀▀ ▀──▀ ─▀▀▀");

        System.out.println("\nBem vindo!" +
                "\nInsira seu nome: ");
        nome = input.next();

        while (true) {
            try {
                System.out.printf("\n%s, escolha entre as opções disponíveis:\n1 - Geometria Plana \n2 - Geometria Espacial\nResposta: ", nome);
                escolha1 = input.nextInt();
                switch (escolha1) {
                    case 1:
                        try {
                            System.out.printf("\n%s, Deseja receber informações de qual figura geométrica: \n1 - Quadrado\n2 - Retângulo\n3 - Triângulo Equilátero\n4 - Circulo\n5 - Hexágono Regular\nResposta: ", nome);
                            escolha2 = input.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Não foi inserido o valor esperado!");
                        }

                        switch (escolha2) {
                            case 1:
                                System.out.println("\n" +
                                        "█▀▀█ █──█ █▀▀█ █▀▀▄ █▀▀█ █▀▀█ █▀▀▄ █▀▀█ \n" +
                                        "█──█ █──█ █▄▄█ █──█ █▄▄▀ █▄▄█ █──█ █──█ \n" +
                                        "▀▀▀█ ─▀▀▀ ▀──▀ ▀▀▀─ ▀─▀▀ ▀──▀ ▀▀▀─ ▀▀▀▀");
                                while (true) {
                                    try {
                                        double ladoQuadrado;
                                        System.out.println("Insira o valor do lado do quadrado: ");
                                        ladoQuadrado = input.nextDouble();
                                        if (ladoQuadrado < 0) {
                                            System.out.println("\nSó será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        Quadrado quadrado = new Quadrado(ladoQuadrado);
                                        System.out.printf("\nA área do quadrado é: %.2f", quadrado.calcularArea());
                                        System.out.printf("\nO perímetro do quadrado é: %.2fm²\n", quadrado.calcularPerimetro());
                                    } catch (InputMismatchException e) {
                                        input.nextLine(); //Limpando o buffer
                                        System.out.println("\nNão foi inserido o tipo apropriado!");
                                        continue;
                                    }
                                    break;
                                }
                                String resposta;
                                System.out.println("\nDeseja continuar (S/N):");
                                resposta = input.next();
                                if (resposta.equalsIgnoreCase("N")) {
                                    break;
                                }
                                continue;



                            case 2:
                                System.out.println("\n" +
                                        "░█▀▀█ █▀▀ ▀▀█▀▀ █▀▀█ █▀▀▄ █▀▀▀ █──█ █── █▀▀█ \n" +
                                        "░█▄▄▀ █▀▀ ──█── █▄▄█ █──█ █─▀█ █──█ █── █──█ \n" +
                                        "░█─░█ ▀▀▀ ──▀── ▀──▀ ▀──▀ ▀▀▀▀ ─▀▀▀ ▀▀▀ ▀▀▀▀");
                                while (true) {
                                    try {
                                        double base;
                                        double altura;
                                        System.out.println("\nInsira o valor da base do retângulo: ");
                                        base = input.nextDouble();
                                        if (base < 0) {
                                            System.out.println("Só será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        System.out.println("Insira o valor da altura do retângulo: ");
                                        altura = input.nextDouble();
                                        if (altura < 0) {
                                            System.out.println("Só será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        Retangulo retangulo = new Retangulo(base, altura);
                                        int respstaMaiusMin;
                                        System.out.println("Tipo de Resposta!\nÍmpar - Letras Minúsculas\nPar - Letras Maiúsculas");
                                        respstaMaiusMin = input.nextInt();
                                        if (respstaMaiusMin % 2 == 0) {
                                            System.out.println(String.format("A área do retângulo é: %.2f", retangulo.calcularArea()).toUpperCase());
                                        } else {
                                            System.out.printf(String.format("\nO perímetro do retângulo é: %.2f", retangulo.calcularPerimetro()).toLowerCase());

                                        }

                                        System.out.printf("A área do retângulo é: %.2f", retangulo.calcularArea());
                                        System.out.printf("\nO perímetro do retângulo é: %.2f", retangulo.calcularPerimetro());
                                    } catch (InputMismatchException e) {
                                        input.nextLine();
                                        System.out.println("Não foi inserido o tipo apropriado!");
                                        continue;
                                    }
                                    break;
                                }
                                String resposta2;
                                System.out.println("\nDeseja continuar (S/N):");
                                resposta2 = input.next();
                                if (resposta2.equalsIgnoreCase("N")) {
                                    break;
                                }
                                continue;

                            case 3:
                                System.out.println("\n" +
                                        "▀▀█▀▀ █▀▀█ ─▀─ █▀▀█ █▀▀▄ █▀▀▀ █──█ █── █▀▀█ 　 ░█▀▀▀ █▀▀█ █──█ ─▀─ █── █▀▀█ ▀▀█▀▀ █▀▀ █▀▀█ █▀▀█ \n" +
                                        "─░█── █▄▄▀ ▀█▀ █▄▄█ █──█ █─▀█ █──█ █── █──█ 　 ░█▀▀▀ █──█ █──█ ▀█▀ █── █▄▄█ ──█── █▀▀ █▄▄▀ █──█ \n" +
                                        "─░█── ▀─▀▀ ▀▀▀ ▀──▀ ▀──▀ ▀▀▀▀ ─▀▀▀ ▀▀▀ ▀▀▀▀ 　 ░█▄▄▄ ▀▀▀█ ─▀▀▀ ▀▀▀ ▀▀▀ ▀──▀ ──▀── ▀▀▀ ▀─▀▀ ▀▀▀▀");
                                while (true) {
                                    try {
                                        double ladoTriang;
                                        System.out.println("\nInsira o valor do lado do Triângulo equilátero: ");
                                        ladoTriang = input.nextDouble();
                                        if (ladoTriang < 0) {
                                            System.out.println("Só será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(ladoTriang);
                                        System.out.printf("A área do triângulo equilátero é: %.2f", trianguloEquilatero.calcularArea());
                                        System.out.printf("\nO perímetro do triângulo equilátero é: %.2f", trianguloEquilatero.calcularPerimetro());
                                    } catch (InputMismatchException e) {
                                        input.nextLine();
                                        System.out.println("Não foi inserido o tipo apropriado!");
                                        continue;
                                    }
                                    break;
                                }
                                String resposta3;
                                System.out.println("\nDeseja continuar (S/N):");
                                resposta3 = input.next();
                                if (resposta3.equalsIgnoreCase("N")) {
                                    break;
                                }
                                continue;

                            case 4:
                                System.out.println("\n" +
                                        "█▀▀ ─▀─ █▀▀█ █▀▀ █──█ █── █▀▀█ \n" +
                                        "█── ▀█▀ █▄▄▀ █── █──█ █── █──█ \n" +
                                        "▀▀▀ ▀▀▀ ▀─▀▀ ▀▀▀ ─▀▀▀ ▀▀▀ ▀▀▀▀");
                                while (true) {
                                    try {
                                        double raio;
                                        System.out.println("\nInsira o valor do raio do circulo: ");
                                        raio = input.nextDouble();
                                        if (raio < 0) {
                                            System.out.println("Só será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        Circulo circulo = new Circulo(raio);
                                        System.out.printf("A área do circulo é: %.2f", circulo.calcularArea());
                                        System.out.printf("\nO perímetro do circulo é: %.2f", circulo.calcularPerimetro());
                                    } catch (InputMismatchException e) {
                                        input.nextLine();
                                        System.out.println("Não foi inserido o tipo apropriado!");
                                        continue;
                                    }
                                    break;
                                }
                                String resposta4;
                                System.out.println("\nDeseja continuar (S/N):");
                                resposta4 = input.next();
                                if (resposta4.equalsIgnoreCase("N")) {
                                    break;
                                }
                                continue;

                            case 5:
                                System.out.println("\n" +
                                        "█──█ █▀▀ █─█ █▀▀█ █▀▀▀ █▀▀█ █▀▀▄ █▀▀█ \n" +
                                        "█▀▀█ █▀▀ ▄▀▄ █▄▄█ █─▀█ █──█ █──█ █──█ \n" +
                                        "▀──▀ ▀▀▀ ▀─▀ ▀──▀ ▀▀▀▀ ▀▀▀▀ ▀──▀ ▀▀▀▀");
                                while (true) {
                                    try {
                                        double ladoHex;
                                        System.out.println("\nInsira o valor do lado do hexágono");
                                        ladoHex = input.nextDouble();
                                        if (ladoHex < 0) {
                                            System.out.println("Só será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        Hexagono hexagono = new Hexagono(ladoHex);
                                        System.out.printf("A área do hexágono é: %.2f", hexagono.calcularArea());
                                        System.out.printf("\nO perímetro do hexágono é: %.2f", hexagono.calcularPerimetro());
                                    } catch (InputMismatchException e) {
                                        input.nextLine();
                                        System.out.println("Não foi inserido o tipo apropriado!");
                                        continue;
                                    }
                                    break;
                                }
                                String resposta5;
                                System.out.println("\nDeseja continuar (S/N):");
                                resposta5 = input.next();
                                if (resposta5.equalsIgnoreCase("N")) {
                                    break;
                                }
                                continue;
                        }
                        break;
                    case 2:
                        System.out.printf("\n%s, Deseja receber informações de qual figura geométrica: \n1 - Cubo\n2 - Paralelepípedo\n3 - Esfera\n4 - Pirâmide de Base Quadrada\n5 - Cilindro \n6 - Cone\nResposta: ", nome);
                        escolha2 = input.nextInt();
                        switch (escolha2) {
                            case 1:
                                System.out.println("\n" +
                                        "█▀▀ █──█ █▀▀▄ █▀▀█ \n" +
                                        "█── █──█ █▀▀▄ █──█ \n" +
                                        "▀▀▀ ─▀▀▀ ▀▀▀─ ▀▀▀▀");
                                while (true) {
                                    try {
                                        double lado;
                                        System.out.println("\nInsira o valor do lado: ");
                                        lado = input.nextDouble();
                                        if (lado < 0) {
                                            System.out.println("Só será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        Cubo cubo = new Cubo(lado);
                                        System.out.printf("O valor da área superficial do cubo é: %.2f", cubo.calcularAreaSuperficial());
                                        System.out.printf("\nO valor do volume do cubo é: %.2f", cubo.calcularVolume());
                                    } catch (InputMismatchException e) {
                                        input.nextLine();
                                        System.out.println("Não foi inserido o tipo apropriado!");
                                        continue;
                                    } break;
                                }
                                String resposta1;
                                System.out.println("\nDeseja continuar (S/N):");
                                resposta1 = input.next();
                                if (resposta1.equalsIgnoreCase("N")) {
                                    break;
                                }
                                continue;

                            case 2:
                                System.out.println("\n" +
                                        "█▀▀█ █▀▀█ █▀▀█ █▀▀█ █── █▀▀ █── █▀▀ █▀▀█ ─▀─ █▀▀█ █▀▀ █▀▀▄ █▀▀█ \n" +
                                        "█──█ █▄▄█ █▄▄▀ █▄▄█ █── █▀▀ █── █▀▀ █──█ ▀█▀ █──█ █▀▀ █──█ █──█ \n" +
                                        "█▀▀▀ ▀──▀ ▀─▀▀ ▀──▀ ▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀ █▀▀▀ ▀▀▀ █▀▀▀ ▀▀▀ ▀▀▀─ ▀▀▀▀");
                                while (true) {
                                    try {
                                        double comprimento;
                                        double altura;
                                        double largura;
                                        System.out.println("\nInsira o valor do comprimento: ");
                                        comprimento = input.nextDouble();
                                        if (comprimento < 0) {
                                            System.out.println("Só será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        System.out.println("Insira o valor da altura: ");
                                        altura = input.nextDouble();
                                        if (altura < 0) {
                                            System.out.println("Só será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        System.out.println("Insira o valor da largura: ");
                                        largura = input.nextDouble();
                                        if (largura < 0) {
                                            System.out.println("Só será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        Paralelepipedo paralelepipedo = new Paralelepipedo(comprimento, altura, largura);
                                        System.out.printf("O valor da área superficial do paralelepípedo é: %.2f", paralelepipedo.calcularAreaSuperficial());
                                        System.out.printf("\nO valor do volume do paralelpípedo é: %.2f", paralelepipedo.calcularVolume());
                                    } catch (InputMismatchException e) {
                                        input.nextLine();
                                        System.out.println("Não foi inserido o tipo apropriado!");
                                        continue;
                                    } break;
                                }
                                String resposta2;
                                System.out.println("\nDeseja continuar (S/N):");
                                resposta2 = input.next();
                                if (resposta2.equalsIgnoreCase("N")) {
                                    break;
                                }
                                continue;

                            case 3:
                                System.out.println("\n" +
                                        "█▀▀ █▀▀ █▀▀ █▀▀ █▀▀█ █▀▀█ \n" +
                                        "█▀▀ ▀▀█ █▀▀ █▀▀ █▄▄▀ █▄▄█ \n" +
                                        "▀▀▀ ▀▀▀ ▀── ▀▀▀ ▀─▀▀ ▀──▀");
                                while (true) {
                                    try {
                                        double raio;
                                        System.out.println("Insira o valor do raio: ");
                                        raio = input.nextDouble();
                                        if (raio < 0) {
                                            System.out.println("Só será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        Esfera esfera = new Esfera(raio);
                                        System.out.printf("O valor da área superficial da esfera é: %.2f", esfera.calcularAreaSuperficial());
                                        System.out.printf("\nO valor do volume da esfera é: %.2f ", esfera.calcularVolume());
                                    } catch (InputMismatchException e) {
                                        input.nextLine();
                                        System.out.println("Não foi inserido o tipo apropriado!");
                                        continue;
                                    } break;
                                }
                                String resposta3;
                                System.out.println("\nDeseja continuar (S/N):");
                                resposta3 = input.next();
                                if (resposta3.equalsIgnoreCase("N")) {
                                    break;
                                }
                                continue;


                            case 4:
                                System.out.println("\n" +
                                        "░█▀▀█ ─▀─ █▀▀█ █▀▀█ █▀▄▀█ ─▀─ █▀▀▄ █▀▀ 　 █▀▀▄ █▀▀ 　 █▀▀▄ █▀▀█ █▀▀ █▀▀ \n" +
                                        "░█▄▄█ ▀█▀ █▄▄▀ █▄▄█ █─▀─█ ▀█▀ █──█ █▀▀ 　 █──█ █▀▀ 　 █▀▀▄ █▄▄█ ▀▀█ █▀▀ \n" +
                                        "░█─── ▀▀▀ ▀─▀▀ ▀──▀ ▀───▀ ▀▀▀ ▀▀▀─ ▀▀▀ 　 ▀▀▀─ ▀▀▀ 　 ▀▀▀─ ▀──▀ ▀▀▀ ▀▀▀ \n" +
                                        "\n" +
                                        "█▀▀█ █──█ █▀▀█ █▀▀▄ █▀▀█ █▀▀█ █▀▀▄ █▀▀█ \n" +
                                        "█──█ █──█ █▄▄█ █──█ █▄▄▀ █▄▄█ █──█ █▄▄█ \n" +
                                        "▀▀▀█ ─▀▀▀ ▀──▀ ▀▀▀─ ▀─▀▀ ▀──▀ ▀▀▀─ ▀──▀");
                                while (true) {
                                    try {
                                        double aresta;
                                        double apotema;
                                        double area;
                                        double alturapir;
                                            System.out.println("Insira o valor da apótema: ");
                                            apotema = input.nextDouble();
                                            if (apotema < 0) {
                                                System.out.println("Só será aceito valores maiores que 0!");
                                                continue;
                                            }
                                            System.out.println("Insira o valor da aresta: ");
                                            aresta = input.nextDouble();
                                            if (aresta < 0) {
                                                System.out.println("Só será aceito valores maiores que 0!");
                                                continue;
                                            }
                                            System.out.println("Insira o valor da área: ");
                                            area = input.nextDouble();
                                            if (area < 0) {
                                                System.out.println("Só será aceito valores maiores que 0!");
                                                continue;
                                            }
                                            System.out.println("Insira o valor da altura da pirâmide: ");
                                            alturapir = input.nextDouble();
                                            if (alturapir < 0) {
                                                System.out.println("Só será aceito valores maiores que 0!");
                                                continue;
                                            }
                                            PiramideQuadrada piramideQuadrada = new PiramideQuadrada(aresta, apotema, area, alturapir);
                                            System.out.printf("O valor da área superficial da pirâmide de base quadrada é: %.2f", piramideQuadrada.calcularAreaSuperficial());
                                            System.out.printf("\nO valor do volume da pirâmide de base quadrada é: %.2f", piramideQuadrada.calcularVolume());
                                    } catch (InputMismatchException e) {
                                        input.nextLine();
                                        System.out.println("Não foi inserido o tipo apropriado!");
                                        continue;
                                    } break;
                                }
                                String resposta4;
                                System.out.println("\nDeseja continuar (S/N):");
                                resposta4 = input.next();
                                if (resposta4.equalsIgnoreCase("N")) {
                                    break;
                                }
                                continue;

                            case 5:
                                System.out.println("\n" +
                                        "█▀▀ ─▀─ █── ─▀─ █▀▀▄ █▀▀▄ █▀▀█ █▀▀█ \n" +
                                        "█── ▀█▀ █── ▀█▀ █──█ █──█ █▄▄▀ █──█ \n" +
                                        "▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀ ▀──▀ ▀▀▀─ ▀─▀▀ ▀▀▀▀");

                                double raioCilindro;
                                double alturaCilindro;
                                while (true) {
                                    try {
                                        System.out.println("\nInsira o valor do raio do cilindro: ");
                                        raioCilindro = input.nextDouble();
                                        if (raioCilindro < 0) {
                                            System.out.println("Só será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        System.out.println("Insira o valor da altura do cilindro: ");
                                        alturaCilindro = input.nextDouble();
                                        if (alturaCilindro < 0) {
                                            System.out.println("Só será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        Cilindro cilindro = new Cilindro(raioCilindro, alturaCilindro);
                                        System.out.printf("O valor da área superficial do cilindro é: %.2f", cilindro.calcularAreaSuperficial());
                                        System.out.printf("\nO valor do volume do cilindro é: %.2f ", cilindro.calcularVolume());
                                    } catch (InputMismatchException e) {
                                        input.nextLine();
                                        System.out.println("Não foi inserido o tipo apropriado!");
                                        continue;
                                    } break;
                                }
                                String resposta5;
                                System.out.println("\nDeseja continuar (S/N):");
                                resposta5 = input.next();
                                if (resposta5.equalsIgnoreCase("N")) {
                                    break;
                                }
                                continue;
                            case 6:
                                System.out.println("\n" +
                                        "█▀▀ █▀▀█ █▀▀▄ █▀▀ \n" +
                                        "█── █──█ █──█ █▀▀ \n" +
                                        "▀▀▀ ▀▀▀▀ ▀──▀ ▀▀▀");
                                double raioCone;
                                double alturaCone;
                                while (true) {
                                    try {
                                        System.out.println("Insira o valor do raio do cone: ");
                                        raioCone = input.nextDouble();
                                        if (raioCone < 0) {
                                            System.out.println("Só será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        System.out.println("Insira o valor da altura do cone: ");
                                        alturaCone = input.nextDouble();
                                        if (alturaCone < 0) {
                                            System.out.println("Só será aceito valores maiores que 0!");
                                            continue;
                                        }
                                        Cone cone = new Cone(raioCone, alturaCone);
                                        System.out.printf("O valor da área superficial do cone é: %.2f ", cone.calcularAreaSuperficial());
                                        System.out.printf("\nO valor do volume do cone é: %.2f ", cone.calcularVolume());
                                    } catch (InputMismatchException e) {
                                        input.nextLine();
                                        System.out.println("Não foi inserido o tipo apropriado!");
                                        continue;
                                    } break;
                                }
                                String resposta6;
                                System.out.println("\nDeseja continuar (S/N):");
                                resposta6 = input.next();
                                if (resposta6.equalsIgnoreCase("N")) {
                                    break;
                                }
                                continue;
                        }

                        if (escolha1 != 1 && escolha1 != 2) {
                            System.out.println("Valor inválido, digite entre os números possíveis");
                        }
                        String resposta;
                        System.out.println("\nDeseja continuar (S/N):");
                        resposta = input.next();
                        if (resposta.equalsIgnoreCase("N")) {
                            break;
                        }
                        continue;

                }
                } catch(InputMismatchException e){
                input.nextLine();
                System.out.println("Não foi inserido o valor esperado!");
                continue;
            } break;
        }
    }
}
