package com.dam2.calculator;

<<<<<<< HEAD
import com.dam2.calculator.ops.OpMinimo;
=======
import com.dam2.calculator.ops.OpMax;
>>>>>>> main
import com.dam2.calculator.ops.OpResta;
import com.dam2.calculator.ops.OpSuma;

public class OperationRouter {

    private static final String OPS_LINE = "Operaciones: suma, resta, Maximo";

    public static String help() {
        return OPS_LINE + "\n" +
               "Formato: operacion + numeros separados por espacios\n" +
               "Ej: suma | 3 5 10";
    }

    public static String run(String op, String input) {
        switch (op.trim().toLowerCase()) {
            case "suma": return OpSuma.run(input);
            case "resta": return OpResta.run(input);
<<<<<<< HEAD
            case "minimo": return OpMinimo.run(input);
=======
            case "maximo": return OpMax.run(input);
>>>>>>> main
            default: return "Operación no reconocida. Escribe 'help'.";
            
           
        }
    }
}
