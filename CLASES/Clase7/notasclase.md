# 📘 [funciones o metodos en java]

## 🧠 Qué aprendí (máx 3 puntos)
los metodos son herramientas o bloque de  codigo que tiene un nombre y realiza una tarea especifica y se puede utilizar varias veces

paso por valor

---

## ⚙️ Cómo funciona (explícalo con tus palabras)
los metodos se declaran en bloque de codigo aparte del main y se utilizan para que el codigo no sea tan dependiente y que pueda ser reutilizABLE

paso por valor quiere decir que si hay un metodo que tiene un parametro y afuera se tiene una variable que envia un argumento no cambia el valor del parametro ni el valor asignado a la variable afuera, lo que se envia al metodo es una copia del valor de la variables, esto solo se usa para tipos de datos primitivos
---

## 💻 Ejemplo práctico

public class App {
    public static void main(String[] args) throws Exception {
        saludar("diego");
    }

    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }
}

paso por valor
 public static void cambiarValor(int numero) {
        numero = 10;
    }
 int miNumero = 5;
       cambiarValor(miNumero);
        System.out.print(miNumero);

---

## ❌ Errores que cometí

*
*

---

## 🔥 Mini reto (obligatorio)

>

---

## 🧪 Resultado / prueba

```java
// pega aquí tu resultado funcionando
```

---

## 🧩 Notas rápidas (opcional)

*
*
