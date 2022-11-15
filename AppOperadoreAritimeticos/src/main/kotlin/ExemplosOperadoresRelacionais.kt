fun main(){

    // == depois ===
    /**
     * Informações
     */

    /**
     * Números Diferentes
     * ==
     */
    var valorD = 10
    var valorO = 20

    var comparacaoDosNumeros1 = (valorD == valorO)

    /**
     * Números Iguais
     * ==
     */
    var valorA = 10
    var valorB = 10

    var comparacaoDosNumeros2 = (valorA == valorB)

    /**
     * Nomes diferentes
     * ==
     */
    var valorN:String = "Campo Grande"
    var valorH:String = "Brasília"

    var comparacaoDosNomes1 = (valorN == valorH)

    /**
     * Nomes Iguais
     * ==
     */
    var valorI:String = "Brasília"
    var valorU:String = "Brasília"

    var comparacaoDosNomes2 = (valorI == valorU)

    /**
     * Maior
     * >
     */
    var valorP:String = "Brasília"
    var valorM:String = "Brasília"

    var comparacaoSeEMaior = (valorP > valorM)

    /**
     * Menor
     * <
     */
    var valorQ:String = "Brasília"
    var valorW:String = "Brasília"

    var comparacaoSeEMenor = (valorQ < valorW)

    /**
     * Menor ou Igual
     * <=
     */
    var valorS:String = "Brasília"
    var valorL:String = "Brasília"

    var eMaiorOuIgual = (valorQ <= valorW)

    /**
     * Diferente?
     * !=
     */
    var valorX:String = "Brasília"
    var valorZ:String = "Brasília"

    var eDiferente = (valorX != valorZ)

    /**
     * Resultados:
     */

    /**
     * Comparação de Números
     */
    print("Comparação de Números:\n\n")
    print("Comparação de Números1: $comparacaoDosNumeros1\n")
    print("Comparação de Números2: $comparacaoDosNumeros2\n\n")

    /**
     * Comparação de Nomes
     */
    print("Comparação de Nomes:\n\n")
    print("Comparação de Nomes1: $comparacaoDosNomes1\n")
    print("Comparação de Nomes2: $comparacaoDosNomes2\n\n")

    /**
     * Comparação de Maior(>), Menor(<) ou Diferente (!=)
     */
    print(" Comparação de Maior, Menor ou Diferente:\n\n")
    print("Comparação se é maior: $comparacaoSeEMaior\n")
    print("Comparação de é menor: $comparacaoSeEMenor\n")
    print("É maior ou Igual?: $eMaiorOuIgual\n")
    print("É diferente?: $eDiferente")

}