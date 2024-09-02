function calcularCalorias(){
    let prato = parseInt(document.getElementById("prato").value);
    let sobremesa = parseInt(document.getElementById("sobremesa").value);
    let bebida = parseInt(document.getElementById("bebida").value);

    let totalCalorias = prato + sobremesa + bebida;

    document.getElementById("resultudo").innerText = "Total de calorias " + totalCalorias + "cal";
}