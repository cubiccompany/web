<#--<#import "parts/common.ftl" as c>-->

<#--<@c.page>-->
<#--    <div class="form-row">-->
<#--        <div class="form-group col-md-6">-->
<#--            <form method="get" action="/main" class="form-inline">-->
<#--                <input type="text" name="filter" class="form-control" value="${filter?ifExists}" placeholder="Search by name">-->
<#--                <button type="submit" class="btn btn-primary ml-2">Search</button>-->
<#--            </form>-->
<#--        </div>-->
<#--    </div>-->

<#--    <a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">-->
<#--        Добавить товар.-->
<#--    </a>-->
<#--    <div class="collapse <#if prod??>show</#if>" id="collapseExample">-->
<#--        <div class="form-group mt-3">-->
<#--            <form method="post"  enctype="multipart/form-data">-->
<#--                <div class="form-group">-->
<#--                    <input type="text" class="form-control ${(textError??)?string('is-invalid', '')}"-->
<#--                           value="<#if prod??>${prod.nameProduct}</#if>" name="nameProduct" placeholder="Название товара" />-->
<#--                    <#if nameError??>-->
<#--                        <div class="invalid-feedback">-->
<#--                            ${nameError}-->
<#--                        </div>-->
<#--                    </#if>-->
<#--                </div>-->

<#--                <div class="form-group">-->
<#--                    <input type="number" class="form-control ${(textError??)?string('is-invalid', '')}"-->
<#--                           value="<#if prod??>${prod.price}</#if>" name="price" placeholder="Стоимость" />-->
<#--                    <#if priceError??>-->
<#--                        <div class="invalid-feedback">-->
<#--                            ${priceError}-->
<#--                        </div>-->
<#--                    </#if>-->
<#--                </div>-->
<#--                <div class="form-group">-->
<#--                    <div class="custom-file">-->
<#--                        <input type="file" name="file" id="customFile">-->
<#--                        <label class="custom-file-label" for="customFile">Добавить изображение</label>-->
<#--                    </div>-->
<#--                </div>-->
<#--                <!--new&ndash;&gt;-->
<#--                <div class="form-group">-->
<#--                    <button type="submit" class="btn btn-primary">Добавить</button>-->
<#--                </div>-->
<#--            </form>-->
<#--        </div>-->
<#--    </div>-->

<#--</@c.page>-->