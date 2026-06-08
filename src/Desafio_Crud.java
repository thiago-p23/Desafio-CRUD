import static java.lang.IO.*;

void main() {

    String[] nomes = new String[10];
    int[] idades = new int[10];
    String[] cursos = new String[10];
    int totalAlunos = 0;
    int opcao;

    while (true) {
        println("\n===== SISTEMA DE CADASTRO DE ALUNOS =====");
        println("1 - Cadastrar aluno");
        println("2 - Listar alunos");
        println("3 - Buscar aluno pelo nome");
        println("4 - Remover aluno");
        println("5 - Sair");

        opcao = Integer.parseInt(readln("Escolha uma opção: "));

        switch (opcao) {

            // CADASTRAR
            case 1:
                if (totalAlunos >= nomes.length) {
                    println("Limite máximo de alunos atingido.");
                    break;
                }

                String nome = readln("Digite o nome do aluno: ");

                if (nome.trim().isEmpty()) {
                    println("ERRO: o nome do aluno não pode ficar vazio.");
                    break;
                }

                int idade = Integer.parseInt(readln("Digite a idade: "));
                String curso = readln("Digite o curso: ");

                nomes[totalAlunos] = nome;
                idades[totalAlunos] = idade;
                cursos[totalAlunos] = curso;
                totalAlunos++;

                println("Aluno cadastrado com sucesso!");
                break;

            // LISTAR
            case 2:
                if (totalAlunos == 0) {
                    println("Nenhum aluno cadastrado.");
                    break;
                }

                println("\n===== LISTA DE ALUNOS =====");

                for (int i = 0; i < totalAlunos; i++) {
                    println("\nAluno " + (i + 1));
                    println("Nome: " + nomes[i]);
                    println("Idade: " + idades[i]);
                    println("Curso: " + cursos[i]);
                }
                break;

            // BUSCAR
            case 3:
                if (totalAlunos == 0) {
                    println("Nenhum aluno cadastrado.");
                    break;
                }

                String busca = readln("Digite o nome do aluno: ");

                boolean encontrado = false;
                for (int i = 0; i < totalAlunos; i++) {
                    if (nomes[i].equalsIgnoreCase(busca)) {
                        println("\nAluno encontrado!");
                        println("Nome: " + nomes[i]);
                        println("Idade: " + idades[i]);
                        println("Curso: " + cursos[i]);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    println("Aluno não encontrado.");
                }
                break;

            // REMOVER
            case 4:
                if (totalAlunos == 0) {
                    println("Nenhum aluno cadastrado.");
                    break;
                }

                String remover = readln("Digite o nome do aluno para remover: ");

                int posicao = -1;

                for (int i = 0; i < totalAlunos; i++) {
                    if (nomes[i].equalsIgnoreCase(remover)) {
                        posicao = i;
                        break;
                    }
                }
                if (posicao == -1) {
                    println("Aluno não encontrado.");
                } else {
                    String confirmacao =
                            readln("Deseja realmente remover este aluno? (S/N): ");

                    if (confirmacao.equalsIgnoreCase("S")) {
                        for (int i = posicao; i < totalAlunos - 1; i++) {
                            nomes[i] = nomes[i + 1];
                            idades[i] = idades[i + 1];
                            cursos[i] = cursos[i + 1];
                        }
                        nomes[totalAlunos - 1] = null;
                        cursos[totalAlunos - 1] = null;
                        idades[totalAlunos - 1] = 0;
                        totalAlunos--;
                        println("Aluno removido com sucesso!");

                    } else {
                        println("Remoção cancelada.");
                    }
                }
                break;

            // SAIR
            case 5:
                println("Sistema encerrado.");
                return;

            default:
                println("Opção inválida.");
        }
    }
}