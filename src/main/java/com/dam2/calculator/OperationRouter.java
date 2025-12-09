package com.dam2.calculator;

import com.dam2.calculator.ops.OpMax;
import com.dam2.calculator.ops.OpResta;
import com.dam2.calculator.ops.OpSuma;
import com.dam2.calculator.ops.OpDivision;
public class OperationRouter {

<<<<<<< HEAD
    private static final String OPS_LINE = "Operaciones: suma, resta, divicion";
=======
    private static final String OPS_LINE = "Operaciones: suma, resta, Maximo";
>>>>>>> main

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
            case "division": return OpDivision.run(input);

=======
            case "maximo": return OpMax.run(input);
>>>>>>> main
            default: return "Operación no reconocida. Escribe 'help'.";
            
           
        }
    }
}
