<form action="cadastro.php" method="post">
    <p>
        <input type="text" name="nome" placeholder="Nome do aparelho" >
    </p>
    <p>
        <input type="number" name="consumo" placeholder="Consumo máx. em watts" step="0.01" >
    </p>
    <p>
        <input type="number" name="horas" placeholder="Horas ligadas por dia" step="0.1" >
    </p>
    <p>
        <input type="number" name="dias" placeholder="Dias ligados por mês" >
    </p>
    <p>
        <input type="number" name="valorkwh" placeholder="Valor do KWH em reais" step="0.1">
    </p>
    <p>
        <button type="submit">Cadastrar</button>
    </p>
</form>
