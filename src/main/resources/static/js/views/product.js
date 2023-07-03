//CREATE AND UPDATE
$(document).on("click", ".open-modal", function () {
    const currentProductId = Number($(this).attr('idproduct'));

    if (currentProductId) {
        const currentProduct = products.find(x => x.id === currentProductId);
        for (const [key, value] of Object.entries(currentProduct)) {
            $(`#${key}`).val(value);
        }
    }
});

$(document).on("click", "#saveProduct", function () {
    for (let [key, value] of Object.entries(productDefault)) {
        productDefault[key] = $(`#${key}`).val();
    }

    $.ajax({
        url: 'api/product',
        contentType: 'application/json',
        dataType: 'json',
        type: 'POST',
        success: function (result) {
            location.reload();
        },
        data: JSON.stringify(productDefault)
    });
})

//Delete
$(document).on("click", ".btnDeleteProduct", function () {
    const currentProductId = Number($(this).attr('idproduct'));
    const currentProduct = products.find(x => x.id === currentProductId);
    $.ajax({
        url: 'api/product',
        contentType: "application/json",
        dataType: 'json',
        type: 'DELETE',
        success: function (result) {
            location.reload();
        }, //here we are serialization the object
        data: JSON.stringify(currentProduct)
    });
})