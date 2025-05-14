<form action="estoque.php" method="post">
        <p>
            <label for="titulo">Título do Livro:</label><br>
            <input type="text" name="titulo" placeholder="Título do livro" required>
        </p>
        <p>
            <label for="autor">Nome do Autor do Livro:</label><br>
            <input type="text" name="autor" placeholder="Autor do livro" required>
        </p>
        <p>
            <label for="preco">Preço Unitário (R$):</label><br>
            <input type="number" name="preco" placeholder="Preço do livro" step="0.01" min="0.01" required>
        </p>
        <p>
            <label for="quantidade">Quantidade de Livros em Estoque:</label><br>
            <input type="number" name="quantidade" placeholder="Quantidade em estoque" min="1" required>
        </p>
        <p>
            <button type="submit">Cadastrar</button>
        </p>
    </form>