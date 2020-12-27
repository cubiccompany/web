<#import "parts/common.ftl" as c>

<@c.page>
    <#if product.filename??>
        <img src="/static/images/${product.filename}" class="rounded mx-auto d-block" alt="...">
    </#if>
    <div class="d-flex justify-content-center" class="mx-auto">
        <i>${product.nameProduct}</i>
    </div>
    <br>
    <div class="d-flex justify-content-center" class="mx-auto">
        <i>${product.price}</i>
    </div>

    <form method="get" action="/by">
        <div >
            <button type="submit" class="btn btn-primary" >Купить</button>
        </div>
    </form>
</@c.page>