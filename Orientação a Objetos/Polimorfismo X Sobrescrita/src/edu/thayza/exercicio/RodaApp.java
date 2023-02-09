package edu.thayza.exercicio;

class RodaApp {
  public static void main(String[] args) {
    ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

    for (ClasseMae classe : classes) {
      classe.metodo1();
      // o polimorfismo ocorre quando os objetos instanciados são diferentes do tipo de dado.
      // na classefilha1 e classefilha2 ocorrerá polimorfismo, visto que é a instância corrente no momento.
      // na classe mae não ocorrerá polimorfismo, já que o tipo de dado é o mesmo que o objeto.
    }

    System.out.println("");

    for (ClasseMae classe : classes) {
      classe.metodo2();
      // nesse caso, só há comportamento polimórfico na classefilha2.
      // quando está na classefilha1, o metodo nao existe entao ele chama o metodo da classemae.
      // quando está na classefilha2, o metodo está mas o tipo de dado é diferente do objeto instanciado, polimorfismo.
      // quando está na classe mae, não há polimorfismo.
    }

    System.out.println("");

    // sobrescrita pura
    // ou seja, o objeto instanciado é a própria classe que chama seu método.
    
    ClasseFilha2 classeFilha2 = new ClasseFilha2();
    classeFilha2.metodo2();
  }
}