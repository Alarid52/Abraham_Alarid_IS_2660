/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.caja;

import ico.fes.camisa.Camisas;
import java.util.Scanner;

/**
 *
 * @author Abraham
 */
public class Caja {

    public static final int CORTA = 1;
    public static final int CORTA2 = 1;
    public static final int SI = 1;
    public static final int SI2 = 1;
    public static final int CASUAL = 2;
    public static final int CASUAL2 = 1;
    public static final int NO = 2;
    public static final int NO2 = 2;
    public static final int FORMAL = 3;
    public static final int FORMAL2 = 2;

    public static void main(String[] args) {
        //Camisas de manga corta
        Camisas mCorta = new Camisas(1, 10, 190, "corta");
        //Camisas de manga larga casual
        Camisas casual = new Camisas(2, 10, 230, "casual");
        //Camisas de manga larga formal
        Camisas formal = new Camisas(3, 10, 310, "formal");

        Scanner scan = new Scanner(System.in);

        int totalCamisas = 0;
        int camisaCorta = 0;
        int camisaCasual = 0;
        int camisaFormal = 0;
        int cantidad;
        int dinero = 0;
        int afirmacion;
        int afirmacion2;
        int tipo;
        int total = 0;
        int respuesta;
        int respuesta2;
        int nuevo_stock;
        int num;
        double descuento;

        System.out.println("************************************************");
        System.out.println("Elige la opción de camisa que deseas adquirir: \n************************************************\n1.- Manga Corta               Stock: " + mCorta.getStock() + "\n2.- Manga larga casual        Stock: " + casual.getStock() + "\n3.- Manga larga formal        Stock: " + formal.getStock() + "");
        System.out.println("************************************************");
        num = scan.nextInt();

        switch (num) {
            //Eleccion de camisa corta
            case CORTA:
                System.out.println("¿Cuantas camisas de manga corta quieres?");
                cantidad = scan.nextInt();
                //validacion corta                
                if (cantidad > mCorta.getStock()) {
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    respuesta = scan.nextInt();
                    switch (respuesta) {
                        case 1:
                            nuevo_stock = cantidad - mCorta.getStock();
                            mCorta.pedirCamisas(cantidad);
                            dinero = mCorta.comprarCamisas(cantidad);
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                            break;
                        case 2:
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                            respuesta2 = scan.nextInt();
                            switch (respuesta2) {
                                case 1:
                                    cantidad = mCorta.getStock();
                                    dinero = mCorta.comprarCamisas(cantidad);
                                    break;
                                case 2:
                                    System.out.println("Contiuamos con la compra...");
                                    cantidad = 0;
                                    dinero = 0;
                                    break;
                                default:
                                    System.out.println("Dato no válido,continuamos con la compra...");
                                    cantidad = 0;
                                    dinero = 0;
                            }
                            break;
                        default:
                            System.out.println("Dato no válido,continuamos con la compra...");
                            cantidad = 0;
                            dinero = 0;
                    }
                } else {
                    dinero = mCorta.comprarCamisas(cantidad);
                }
                camisaCorta = cantidad;
                totalCamisas += cantidad;
                //validacion corta
                System.out.println("Total de camisas de manga corta: $" + dinero);
                System.out.println("************************************************");
                total += dinero;
                System.out.println("¿Quieres comprar camisas de otro tipo?\n1.- Si\n2.- No");
                afirmacion = scan.nextInt();
                switch (afirmacion) {
                    case SI:
                        System.out.println("Elige que camisa quieres: \n1.- Manga larga casual\n2.- Manga larga formal ");
                        tipo = scan.nextInt();
                        switch (tipo) {
                            //Eleccion de camisa casual
                            case CASUAL2:
                                System.out.println("¿Cuantas camisas casuales quieres?");
                                cantidad = scan.nextInt();
                                //validacion casual
                                if (cantidad > casual.getStock()) {
                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    respuesta = scan.nextInt();
                                    switch (respuesta) {
                                        case 1:
                                            nuevo_stock = cantidad - casual.getStock();
                                            casual.pedirCamisas(cantidad);
                                            dinero = casual.comprarCamisas(cantidad);
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            break;
                                        case 2:
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            respuesta2 = scan.nextInt();
                                            switch (respuesta2) {
                                                case 1:
                                                    cantidad = casual.getStock();
                                                    dinero = casual.comprarCamisas(cantidad);
                                                    break;
                                                case 2:
                                                    System.out.println("Contiuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                                    break;
                                                default:
                                                    System.out.println("Dato no válido,continuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                            }
                                            break;
                                        default:
                                            System.out.println("Dato no válido,continuamos con la compra...");
                                            cantidad = 0;
                                            dinero = 0;
                                    }
                                } else {
                                    dinero = casual.comprarCamisas(cantidad);
                                }
                                camisaCasual = cantidad;
                                totalCamisas += cantidad;
                                //validacion casual
                                System.out.println("Total de camisas casuales: $" + dinero);
                                System.out.println("************************************************");
                                total += dinero;
                                System.out.println("¿Quieres comprar camisas formales?\n1.- Si\n2.- No");
                                afirmacion2 = scan.nextInt();
                                switch (afirmacion2) {
                                    //Eleccion camisa formal
                                    case SI2:
                                        System.out.println("¿Cuantas camisas formales quieres?");
                                        cantidad = scan.nextInt();
                                        //validacion formal
                                        if (cantidad > formal.getStock()) {
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            respuesta = scan.nextInt();
                                            switch (respuesta) {
                                                case 1:
                                                    nuevo_stock = cantidad - formal.getStock();
                                                    formal.pedirCamisas(cantidad);
                                                    dinero = formal.comprarCamisas(cantidad);
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    break;
                                                case 2:
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    respuesta2 = scan.nextInt();
                                                    switch (respuesta2) {
                                                        case 1:
                                                            cantidad = formal.getStock();
                                                            dinero = formal.comprarCamisas(cantidad);
                                                            break;
                                                        case 2:
                                                            System.out.println("Contiuamos con la compra...");
                                                            cantidad = 0;
                                                            dinero = 0;
                                                            break;
                                                        default:
                                                            System.out.println("Dato no válido,continuamos con la compra...");
                                                            cantidad = 0;
                                                            dinero = 0;
                                                    }
                                                    break;
                                                default:
                                                    System.out.println("Dato no válido,continuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                            }
                                        } else {
                                            dinero = formal.comprarCamisas(cantidad);
                                        }
                                        camisaFormal = cantidad;
                                        totalCamisas += cantidad;
                                        //validacion formal
                                        System.out.println("Total de camisas formales: $" + dinero);
                                        System.out.println("************************************************");
                                        total += dinero;
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                        break;
                                    case NO2:
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                        break;
                                    default:
                                        System.out.println("No ingresaste un dato válido.");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                }
                                break;
                            //Eleccion camisa formal
                            case FORMAL2:
                                System.out.println("¿Cuantas camisas formales quieres?");
                                cantidad = scan.nextInt();
                                //validacion formal
                                if (cantidad > formal.getStock()) {
                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    respuesta = scan.nextInt();
                                    switch (respuesta) {
                                        case 1:
                                            nuevo_stock = cantidad - formal.getStock();
                                            formal.pedirCamisas(cantidad);
                                            dinero = formal.comprarCamisas(cantidad);
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            break;
                                        case 2:
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            respuesta2 = scan.nextInt();
                                            switch (respuesta2) {
                                                case 1:
                                                    cantidad = formal.getStock();
                                                    dinero = formal.comprarCamisas(cantidad);
                                                    break;
                                                case 2:
                                                    System.out.println("Contiuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                                    break;
                                                default:
                                                    System.out.println("Dato no válido,continuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                            }
                                            break;
                                        default:
                                            System.out.println("Dato no válido,continuamos con la compra...");
                                            cantidad = 0;
                                            dinero = 0;
                                    }
                                } else {
                                    dinero = formal.comprarCamisas(cantidad);
                                }
                                camisaFormal = cantidad;
                                totalCamisas += cantidad;
                                //validacion formal
                                System.out.println("Total de camisas formales: $" + dinero);
                                System.out.println("************************************************");
                                total += dinero;
                                System.out.println("¿Quieres comprar camisas casuales?\n1.- Si\n2.- No");
                                afirmacion2 = scan.nextInt();
                                switch (afirmacion2) {
                                    case SI2:
                                        System.out.println("¿Cuantas camisas casuales quieres?");
                                        cantidad = scan.nextInt();
                                        //validacion casual
                                        if (cantidad > casual.getStock()) {
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            respuesta = scan.nextInt();
                                            switch (respuesta) {
                                                case 1:
                                                    nuevo_stock = cantidad - casual.getStock();
                                                    casual.pedirCamisas(cantidad);
                                                    dinero = casual.comprarCamisas(cantidad);
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    break;
                                                case 2:
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    respuesta2 = scan.nextInt();
                                                    switch (respuesta2) {
                                                        case 1:
                                                            cantidad = casual.getStock();
                                                            dinero = casual.comprarCamisas(cantidad);
                                                            break;
                                                        case 2:
                                                            System.out.println("Contiuamos con la compra...");
                                                            cantidad = 0;
                                                            dinero = 0;
                                                            break;
                                                        default:
                                                            System.out.println("Dato no válido,continuamos con la compra...");
                                                            cantidad = 0;
                                                            dinero = 0;
                                                    }
                                                    break;
                                                default:
                                                    System.out.println("Dato no válido,continuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                            }
                                        } else {
                                            dinero = casual.comprarCamisas(cantidad);
                                        }
                                        camisaCasual = cantidad;
                                        totalCamisas += cantidad;
                                        //validacion casual
                                        System.out.println("Total de camisas formales: $" + dinero);
                                        System.out.println("************************************************");
                                        total += dinero;
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                        break;
                                    case NO2:
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                        break;
                                    default:
                                        System.out.println("No ingresaste un dato válido.");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                }
                                break;
                            default:
                                System.out.println("No ingresaste un dato válido.");
                                System.out.println("------------------------------------------------------");
                                System.out.println("Información de compra:");
                                System.out.println("------------------------------------------------------");
                                System.out.println("Camisas de manga corta: " + camisaCorta);
                                System.out.println("Camisas casuales: " + camisaCasual);
                                System.out.println("Camisas formales: " + camisaFormal);
                                System.out.println("Cantidad total de camisas: " + totalCamisas);
                                System.out.println("Total a pagar: $" + total);
                        }
                        break;
                    case NO:
                        System.out.println("------------------------------------------------------");
                        System.out.println("Información de compra:");
                        System.out.println("------------------------------------------------------");
                        System.out.println("Camisas de manga corta: " + camisaCorta);
                        System.out.println("Camisas casuales: " + camisaCasual);
                        System.out.println("Camisas formales: " + camisaFormal);
                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                        System.out.println("Total a pagar: $" + total);
                        break;
                    default:
                        System.out.println("No ingresaste un dato válido.");
                        System.out.println("------------------------------------------------------");
                        System.out.println("Información de compra:");
                        System.out.println("------------------------------------------------------");
                        System.out.println("Camisas de manga corta: " + camisaCorta);
                        System.out.println("Camisas casuales: " + camisaCasual);
                        System.out.println("Camisas formales: " + camisaFormal);
                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                        System.out.println("Total a pagar: $" + total);
                }
                break;
            //Eleccion camisa casual
            case CASUAL:
                System.out.println("¿Cuantas camisas casuales quieres?");
                cantidad = scan.nextInt();
                if (cantidad > casual.getStock()) {
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    respuesta = scan.nextInt();
                    switch (respuesta) {
                        case 1:
                            nuevo_stock = cantidad - casual.getStock();
                            casual.pedirCamisas(cantidad);
                            dinero = casual.comprarCamisas(cantidad);
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                            break;
                        case 2:
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                            respuesta2 = scan.nextInt();
                            switch (respuesta2) {
                                case 1:
                                    cantidad = casual.getStock();
                                    dinero = casual.comprarCamisas(cantidad);
                                    break;
                                case 2:
                                    System.out.println("Contiuamos con la compra...");
                                    cantidad = 0;
                                    dinero = 0;
                                    break;
                                default:
                                    System.out.println("Dato no válido,continuamos con la compra...");
                                    cantidad = 0;
                                    dinero = 0;
                            }
                            break;
                        default:
                            System.out.println("Dato no válido,continuamos con la compra...");
                            cantidad = 0;
                            dinero = 0;
                    }
                } else {
                    dinero = casual.comprarCamisas(cantidad);
                }
                camisaCasual = cantidad;
                totalCamisas += cantidad;
                System.out.println("Total de camisas casuales: $" + dinero);
                System.out.println("************************************************");
                total += dinero;
                System.out.println("¿Quieres comprar camisas de otro tipo?\n1.- Si\n2.- No");
                afirmacion = scan.nextInt();
                switch (afirmacion) {
                    case SI:
                        System.out.println("Elige que camisa quieres: \n1.- Manga corta\n2.- Manga larga formal ");
                        tipo = scan.nextInt();
                        switch (tipo) {
                            case CORTA2:
                                System.out.println("¿Cuantas camisas de manga corta quieres?");
                                cantidad = scan.nextInt();
                                if (cantidad > mCorta.getStock()) {
                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    respuesta = scan.nextInt();
                                    switch (respuesta) {
                                        case 1:
                                            nuevo_stock = cantidad - mCorta.getStock();
                                            mCorta.pedirCamisas(cantidad);
                                            dinero = mCorta.comprarCamisas(cantidad);
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            break;
                                        case 2:
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            respuesta2 = scan.nextInt();
                                            switch (respuesta2) {
                                                case 1:
                                                    cantidad = mCorta.getStock();
                                                    dinero = mCorta.comprarCamisas(cantidad);
                                                    break;
                                                case 2:
                                                    System.out.println("Contiuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                                    break;
                                                default:
                                                    System.out.println("Dato no válido,continuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                            }
                                            break;
                                        default:
                                            System.out.println("Dato no válido,continuamos con la compra...");
                                            cantidad = 0;
                                            dinero = 0;
                                    }
                                } else {
                                    dinero = mCorta.comprarCamisas(cantidad);
                                }
                                camisaCorta = cantidad;
                                totalCamisas += cantidad;
                                System.out.println("Total de camisas de manga corta: $" + dinero);
                                System.out.println("************************************************");
                                total += dinero;
                                System.out.println("¿Quieres comprar camisas formales?\n1.- Si\n2.- No");
                                afirmacion2 = scan.nextInt();
                                switch (afirmacion2) {
                                    case SI2:
                                        System.out.println("¿Cuantas camisas formales quieres?");
                                        cantidad = scan.nextInt();
                                        if (cantidad > formal.getStock()) {
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            respuesta = scan.nextInt();
                                            switch (respuesta) {
                                                case 1:
                                                    nuevo_stock = cantidad - formal.getStock();
                                                    formal.pedirCamisas(cantidad);
                                                    dinero = formal.comprarCamisas(cantidad);
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    break;
                                                case 2:
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    respuesta2 = scan.nextInt();
                                                    switch (respuesta2) {
                                                        case 1:
                                                            cantidad = formal.getStock();
                                                            dinero = formal.comprarCamisas(cantidad);
                                                            break;
                                                        case 2:
                                                            System.out.println("Contiuamos con la compra...");
                                                            cantidad = 0;
                                                            dinero = 0;
                                                            break;
                                                        default:
                                                            System.out.println("Dato no válido,continuamos con la compra...");
                                                            cantidad = 0;
                                                            dinero = 0;
                                                    }
                                                    break;
                                                default:
                                                    System.out.println("Dato no válido,continuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                            }
                                        } else {
                                            dinero = formal.comprarCamisas(cantidad);
                                        }
                                        camisaFormal = cantidad;
                                        totalCamisas += cantidad;
                                        System.out.println("Total de camisas formales: $" + dinero);
                                        System.out.println("************************************************");
                                        total += dinero;
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                        break;
                                    case NO2:
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                        break;
                                    default:
                                        System.out.println("No ingresaste un dato válido.");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                }
                                break;
                            case FORMAL2:
                                System.out.println("¿Cuantas camisas formales quieres?");
                                cantidad = scan.nextInt();
                                if (cantidad > formal.getStock()) {
                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    respuesta = scan.nextInt();
                                    switch (respuesta) {
                                        case 1:
                                            nuevo_stock = cantidad - formal.getStock();
                                            formal.pedirCamisas(cantidad);
                                            dinero = formal.comprarCamisas(cantidad);
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            break;
                                        case 2:
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            respuesta2 = scan.nextInt();
                                            switch (respuesta2) {
                                                case 1:
                                                    cantidad = formal.getStock();
                                                    dinero = formal.comprarCamisas(cantidad);
                                                    break;
                                                case 2:
                                                    System.out.println("Contiuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                                    break;
                                                default:
                                                    System.out.println("Dato no válido,continuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                            }
                                            break;
                                        default:
                                            System.out.println("Dato no válido,continuamos con la compra...");
                                            cantidad = 0;
                                            dinero = 0;
                                    }
                                } else {
                                    dinero = formal.comprarCamisas(cantidad);
                                }
                                camisaFormal = cantidad;
                                totalCamisas += cantidad;
                                System.out.println("Total de camisas formales: $" + dinero);
                                System.out.println("************************************************");
                                total += dinero;
                                System.out.println("¿Quieres comprar camisas de manga corta?\n1.- Si\n2.- No");
                                afirmacion2 = scan.nextInt();
                                switch (afirmacion2) {
                                    case SI2:
                                        System.out.println("¿Cuantas camisas de manga corta quieres?");
                                        cantidad = scan.nextInt();
                                        if (cantidad > mCorta.getStock()) {
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            respuesta = scan.nextInt();
                                            switch (respuesta) {
                                                case 1:
                                                    nuevo_stock = cantidad - mCorta.getStock();
                                                    mCorta.pedirCamisas(cantidad);
                                                    dinero = mCorta.comprarCamisas(cantidad);
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    break;
                                                case 2:
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    respuesta2 = scan.nextInt();
                                                    switch (respuesta2) {
                                                        case 1:
                                                            cantidad = mCorta.getStock();
                                                            dinero = mCorta.comprarCamisas(cantidad);
                                                            break;
                                                        case 2:
                                                            System.out.println("Contiuamos con la compra...");
                                                            cantidad = 0;
                                                            dinero = 0;
                                                            break;
                                                        default:
                                                            System.out.println("Dato no válido,continuamos con la compra...");
                                                            cantidad = 0;
                                                            dinero = 0;
                                                    }
                                                    break;
                                                default:
                                                    System.out.println("Dato no válido,continuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                            }
                                        } else {
                                            dinero = mCorta.comprarCamisas(cantidad);
                                        }
                                        camisaCorta = cantidad;
                                        totalCamisas += cantidad;
                                        System.out.println("Total de camisas de manga corta: $" + dinero);
                                        System.out.println("************************************************");
                                        total += dinero;
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                        break;
                                    case NO2:
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                        break;
                                    default:
                                        System.out.println("No ingresaste un dato válido.");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                }
                                break;
                            default:
                                System.out.println("No ingresaste un dato válido.");
                                System.out.println("------------------------------------------------------");
                                System.out.println("Información de compra:");
                                System.out.println("------------------------------------------------------");
                                System.out.println("Camisas de manga corta: " + camisaCorta);
                                System.out.println("Camisas casuales: " + camisaCasual);
                                System.out.println("Camisas formales: " + camisaFormal);
                                System.out.println("Cantidad total de camisas: " + totalCamisas);
                                System.out.println("Total a pagar: $" + total);
                        }
                        break;
                    case NO:
                        System.out.println("------------------------------------------------------");
                        System.out.println("Información de compra:");
                        System.out.println("------------------------------------------------------");
                        System.out.println("Camisas de manga corta: " + camisaCorta);
                        System.out.println("Camisas casuales: " + camisaCasual);
                        System.out.println("Camisas formales: " + camisaFormal);
                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                        System.out.println("Total a pagar: $" + total);
                        break;
                    default:
                        System.out.println("No ingresaste un dato válido.");
                        System.out.println("------------------------------------------------------");
                        System.out.println("Información de compra:");
                        System.out.println("------------------------------------------------------");
                        System.out.println("Camisas de manga corta: " + camisaCorta);
                        System.out.println("Camisas casuales: " + camisaCasual);
                        System.out.println("Camisas formales: " + camisaFormal);
                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                        System.out.println("Total a pagar: $" + total);
                }
                break;
            //Eleccion camisa formal
            case FORMAL:
                System.out.println("¿Cuantas camisas formales quieres?");
                cantidad = scan.nextInt();
                if (cantidad > formal.getStock()) {
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    respuesta = scan.nextInt();
                    switch (respuesta) {
                        case 1:
                            nuevo_stock = cantidad - formal.getStock();
                            formal.pedirCamisas(cantidad);
                            dinero = formal.comprarCamisas(cantidad);
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                            break;
                        case 2:
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                            respuesta2 = scan.nextInt();
                            switch (respuesta2) {
                                case 1:
                                    cantidad = formal.getStock();
                                    dinero = formal.comprarCamisas(cantidad);
                                    break;
                                case 2:
                                    System.out.println("Contiuamos con la compra...");
                                    cantidad = 0;
                                    dinero = 0;
                                    break;
                                default:
                                    System.out.println("Dato no válido,continuamos con la compra...");
                                    cantidad = 0;
                                    dinero = 0;
                            }
                            break;
                        default:
                            System.out.println("Dato no válido,continuamos con la compra...");
                            cantidad = 0;
                            dinero = 0;
                    }
                } else {
                    dinero = formal.comprarCamisas(cantidad);
                }
                camisaFormal = cantidad;
                totalCamisas += cantidad;
                System.out.println("Total de camisas formales: $" + dinero);
                System.out.println("************************************************");
                total += dinero;
                System.out.println("¿Quieres comprar camisas de otro tipo?\n1.- Si\n2.- No");
                afirmacion = scan.nextInt();
                switch (afirmacion) {
                    case SI:
                        System.out.println("Elige que camisa quieres: \n1.- Manga corta\n2.- Manga larga casual ");
                        tipo = scan.nextInt();
                        switch (tipo) {
                            case CORTA2:
                                System.out.println("¿Cuantas camisas de manga corta quieres?");
                                cantidad = scan.nextInt();
                                if (cantidad > mCorta.getStock()) {
                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    respuesta = scan.nextInt();
                                    switch (respuesta) {
                                        case 1:
                                            nuevo_stock = cantidad - mCorta.getStock();
                                            mCorta.pedirCamisas(cantidad);
                                            dinero = mCorta.comprarCamisas(cantidad);
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            break;
                                        case 2:
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            respuesta2 = scan.nextInt();
                                            switch (respuesta2) {
                                                case 1:
                                                    cantidad = mCorta.getStock();
                                                    dinero = mCorta.comprarCamisas(cantidad);
                                                    break;
                                                case 2:
                                                    System.out.println("Contiuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                                    break;
                                                default:
                                                    System.out.println("Dato no válido,continuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                            }
                                            break;
                                        default:
                                            System.out.println("Dato no válido,continuamos con la compra...");
                                            cantidad = 0;
                                            dinero = 0;
                                    }
                                } else {
                                    dinero = mCorta.comprarCamisas(cantidad);
                                }
                                camisaCorta = cantidad;
                                totalCamisas += cantidad;
                                System.out.println("Total de camisas de manga corta: $" + dinero);
                                System.out.println("************************************************");
                                total += dinero;
                                System.out.println("¿Quieres comprar camisas casuales?\n1.- Si\n2.- No");
                                afirmacion2 = scan.nextInt();
                                switch (afirmacion2) {
                                    case SI2:
                                        System.out.println("¿Cuantas camisas casuales quieres?");
                                        cantidad = scan.nextInt();
                                        if (cantidad > casual.getStock()) {
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            respuesta = scan.nextInt();
                                            switch (respuesta) {
                                                case 1:
                                                    nuevo_stock = cantidad - casual.getStock();
                                                    casual.pedirCamisas(cantidad);
                                                    dinero = casual.comprarCamisas(cantidad);
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    break;
                                                case 2:
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    respuesta2 = scan.nextInt();
                                                    switch (respuesta2) {
                                                        case 1:
                                                            cantidad = casual.getStock();
                                                            dinero = casual.comprarCamisas(cantidad);
                                                            break;
                                                        case 2:
                                                            System.out.println("Contiuamos con la compra...");
                                                            cantidad = 0;
                                                            dinero = 0;
                                                            break;
                                                        default:
                                                            System.out.println("Dato no válido,continuamos con la compra...");
                                                            cantidad = 0;
                                                            dinero = 0;
                                                    }
                                                    break;
                                                default:
                                                    System.out.println("Dato no válido,continuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                            }
                                        } else {
                                            dinero = casual.comprarCamisas(cantidad);
                                        }
                                        camisaCasual = cantidad;
                                        totalCamisas += cantidad;
                                        System.out.println("Total de camisas casuales: $" + dinero);
                                        System.out.println("************************************************");
                                        total += dinero;
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                        break;
                                    case NO2:
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                        break;
                                    default:
                                        System.out.println("No ingresaste un dato válido.");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                }
                                break;
                            case FORMAL2:
                                System.out.println("¿Cuantas camisas casuales quieres?");
                                cantidad = scan.nextInt();
                                if (cantidad > casual.getStock()) {
                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    respuesta = scan.nextInt();
                                    switch (respuesta) {
                                        case 1:
                                            nuevo_stock = cantidad - casual.getStock();
                                            casual.pedirCamisas(cantidad);
                                            dinero = casual.comprarCamisas(cantidad);
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            break;
                                        case 2:
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            respuesta2 = scan.nextInt();
                                            switch (respuesta2) {
                                                case 1:
                                                    cantidad = casual.getStock();
                                                    dinero = casual.comprarCamisas(cantidad);
                                                    break;
                                                case 2:
                                                    System.out.println("Contiuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                                    break;
                                                default:
                                                    System.out.println("Dato no válido,continuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                            }
                                            break;
                                        default:
                                            System.out.println("Dato no válido,continuamos con la compra...");
                                            cantidad = 0;
                                            dinero = 0;
                                    }
                                } else {
                                    dinero = casual.comprarCamisas(cantidad);
                                }
                                camisaCasual = cantidad;
                                totalCamisas += cantidad;
                                System.out.println("Total de camisas casuales: $" + dinero);
                                System.out.println("************************************************");
                                total += dinero;
                                System.out.println("¿Quieres comprar camisas de manga corta?\n1.- Si\n2.- No");
                                afirmacion2 = scan.nextInt();
                                switch (afirmacion2) {
                                    case SI2:
                                        System.out.println("¿Cuantas camisas de manga corta quieres?");
                                        cantidad = scan.nextInt();
                                        if (cantidad > mCorta.getStock()) {
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            System.out.println("No hay suficientes camisas en bodega\n¿Quieres pedir las camisas que falta a otra bodega?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                            respuesta = scan.nextInt();
                                            switch (respuesta) {
                                                case 1:
                                                    nuevo_stock = cantidad - mCorta.getStock();
                                                    mCorta.pedirCamisas(cantidad);
                                                    dinero = mCorta.comprarCamisas(cantidad);
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    System.out.println("Camisas agregadas de otra bodega: " + nuevo_stock);
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    break;
                                                case 2:
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    System.out.println("¿Quieres todo el stock disponible?\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n1.-Si\n2.-No");
                                                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                    respuesta2 = scan.nextInt();
                                                    switch (respuesta2) {
                                                        case 1:
                                                            cantidad = mCorta.getStock();
                                                            dinero = mCorta.comprarCamisas(cantidad);
                                                            break;
                                                        case 2:
                                                            System.out.println("Contiuamos con la compra...");
                                                            cantidad = 0;
                                                            dinero = 0;
                                                            break;
                                                        default:
                                                            System.out.println("Dato no válido,continuamos con la compra...");
                                                            cantidad = 0;
                                                            dinero = 0;
                                                    }
                                                    break;
                                                default:
                                                    System.out.println("Dato no válido,continuamos con la compra...");
                                                    cantidad = 0;
                                                    dinero = 0;
                                            }
                                        } else {
                                            dinero = mCorta.comprarCamisas(cantidad);
                                        }
                                        camisaCorta = cantidad;
                                        totalCamisas += cantidad;
                                        System.out.println("Total de camisas de manga corta: $" + dinero);
                                        System.out.println("************************************************");
                                        total += dinero;
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                        break;
                                    case NO2:
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                        break;
                                    default:
                                        System.out.println("No ingresaste un dato válido.");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Información de compra:");
                                        System.out.println("------------------------------------------------------");
                                        System.out.println("Camisas de manga corta: " + camisaCorta);
                                        System.out.println("Camisas casuales: " + camisaCasual);
                                        System.out.println("Camisas formales: " + camisaFormal);
                                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                                        System.out.println("Total a pagar: $" + total);
                                }
                                break;
                            default:
                                System.out.println("No ingresaste un dato válido.");
                                System.out.println("------------------------------------------------------");
                                System.out.println("Información de compra:");
                                System.out.println("------------------------------------------------------");
                                System.out.println("Camisas de manga corta: " + camisaCorta);
                                System.out.println("Camisas casuales: " + camisaCasual);
                                System.out.println("Camisas formales: " + camisaFormal);
                                System.out.println("Cantidad total de camisas: " + totalCamisas);
                                System.out.println("Total a pagar: $" + total);
                        }
                        break;
                    case NO:
                        System.out.println("------------------------------------------------------");
                        System.out.println("Información de compra:");
                        System.out.println("------------------------------------------------------");
                        System.out.println("Camisas de manga corta: " + camisaCorta);
                        System.out.println("Camisas casuales: " + camisaCasual);
                        System.out.println("Camisas formales: " + camisaFormal);
                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                        System.out.println("Total a pagar: $" + total);
                        break;
                    default:
                        System.out.println("No ingresaste un dato válido.");
                        System.out.println("------------------------------------------------------");
                        System.out.println("Información de compra:");
                        System.out.println("------------------------------------------------------");
                        System.out.println("Camisas de manga corta: " + camisaCorta);
                        System.out.println("Camisas casuales: " + camisaCasual);
                        System.out.println("Camisas formales: " + camisaFormal);
                        System.out.println("Cantidad total de camisas: " + totalCamisas);
                        System.out.println("Total a pagar: $" + total);
                }
                break;
            default:
                System.out.println("No ingresaste un dato válido.");
                System.out.println("------------------------------------------------------");
                System.out.println("Información de compra:");
                System.out.println("------------------------------------------------------");
                System.out.println("Camisas de manga corta: " + camisaCorta);
                System.out.println("Camisas casuales: " + camisaCasual);
                System.out.println("Camisas formales: " + camisaFormal);
                System.out.println("Cantidad total de camisas: " + totalCamisas);
                System.out.println("Total a pagar: $" + total);
        }
        //Descuento sobre total
        if (totalCamisas <= 2) {
            System.out.println("------------------------------------------------------");
            System.out.println("No hay descuento");
            System.out.println("------------------------------------------------------");
        } else if (totalCamisas > 2 && totalCamisas <= 5) {
            double total_nuevo = (double) total;
            descuento = total_nuevo * 0.05;
            total_nuevo -= descuento;
            System.out.println("------------------------------------------------------");
            System.out.println("Precio con descuento del 5%: $" + total_nuevo);
            System.out.println("------------------------------------------------------");
        } else if (totalCamisas > 5) {
            double total_nuevo = (double) total;
            descuento = total_nuevo * 0.08;
            total_nuevo -= descuento;
            System.out.println("------------------------------------------------------");
            System.out.println("Precio con descuento del 8%: $" + total_nuevo);
            System.out.println("------------------------------------------------------");
        }

    }
}
