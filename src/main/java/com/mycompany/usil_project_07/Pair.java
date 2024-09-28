
package com.mycompany.usil_project_07;

//Tipo de datos genericos en JAVA: E, T, K, V,S

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pair<K,V> {
    private K clave;
    private V valor;
}