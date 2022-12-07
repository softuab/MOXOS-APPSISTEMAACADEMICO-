const trs = document.querySelectorAll(".table tbody tr");
for (let item of trs) {
    item.addEventListener("click", function (e) {
        limPiarfilas();
        this.classList.add("selected");
    });
}
const limPiarfilas = () => {
    for (let item of trs) {
        item.classList.remove("selected");
    }
};
const filter = (input, nametable) => {
    // Declare variables  
    var filter, table, tr, td, i, j, visible;
    filter = input.value.toUpperCase();
    table = document.getElementById(nametable);
    tr = table.getElementsByClassName("filter");
    // Loop through all table rows, and hide those who don't match the search query
    for (i = 0; i < tr.length; i++) {
        visible = false;
        /* Obtenemos todas las celdas de la fila, no sólo la primera */
        td = tr[i].getElementsByTagName("td");
        for (j = 0; j < td.length; j++) {
            if (td[j] && td[j].innerHTML.toUpperCase().indexOf(filter) > -1) {
                visible = true;
            }
        }
        if (visible === true) {
            tr[i].style.display = "";
        } else {
            tr[i].style.display = "none";
        }
    }
}