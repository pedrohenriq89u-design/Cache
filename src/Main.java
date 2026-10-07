//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    Scanner scanner = new Scanner(System.in);

    List<Pessoa> banco = new ArrayList<>();

    banco.add(new Pessoa(1, "Cleberson Horsth", 76));
    banco.add(new Pessoa(2, "Sergio Herval", 68));
    banco.add(new Pessoa(3, "Kiko", 74));
    banco.add(new Pessoa(4, "Nando", 73));
    banco.add(new Pessoa(5, "Feghali", 71));


    List<Pessoa> cache = new ArrayList<>();

    IO.println("Digite o ID da pessoa:");
    int idBusca = scanner.nextInt();

    Pessoa pessoaEncontrada = null;

    for (Pessoa pessoa : cache) {

        if (pessoa.id == idBusca) {
            pessoaEncontrada = pessoa;
            break;
        }
    }

    if (pessoaEncontrada != null) {

        IO.println(
                "Pessoa encontrada no cache: "
                        + pessoaEncontrada
        );

    } else {

        for (Pessoa pessoa : banco) {

            if (pessoa.id == idBusca) {
                pessoaEncontrada = pessoa;
                break;
            }
        }

        if (pessoaEncontrada != null) {

            if (cache.size() == 10) {
                cache.remove(0);
            }

            cache.add(pessoaEncontrada);

            IO.println(
                    "Pessoa buscada no banco e adicionada ao cache: "
                            + pessoaEncontrada
            );

        } else {

            IO.println("Pessoa não encontrada.");
        }
    }
}
