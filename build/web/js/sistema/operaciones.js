const optionscollection = (array, idPadre, id) => {
    var filter = array.filter(p => p.idParent === idPadre);
    var options = '<option value="-1"> - Elija una opcion - </option>';
    filter.forEach(obj => {
        if (obj.id === id) {
            options += `<option value="${obj.id}" selected>${obj.value}</option>`;
        } else
            options += `<option value="${obj.id}">${obj.value}</option>`;
    });
    return options;
};
const optionscollectioncomplete = (array, idPadre, id) => {
    var filter = array.filter(p => p.idParent === idPadre);
    var options = '<option value="-1"> - Elija una opcion - </option>';
    filter.forEach(obj => {
        if (obj.id === id) {
            options += `<option value="${obj.id}" selected>${obj.value}</option>`;
        } else
            options += `<option value="${obj.id}">${obj.value}</option>`;
    });
    return options;
};