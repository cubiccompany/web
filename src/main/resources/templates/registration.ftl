<#import "parts/common.ftl" as c>

<@c.page>

<form action="/registration" method="post" class="px-4 py-3" xmlns="http://www.w3.org/1999/html">

        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Имя: </label>
            <div class="col-sm-6">
                <input type="text" name="name" placeholder="Имя">
            </div>
        </div>



        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Пароль: </label>
            <div class="col-sm-6">
                <input type="password" name="password" placeholder="Пароль" class="form-control">
            </div>
        </div>

        <div class="form-group row">
            <label class="col-sm-2 col-form-label">email: </label>
            <div class="col-sm-6">
                <input type="email" name="username" placeholder="Почта">
            </div>
        </div>

        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Фамилия: </label>
            <div class="col-sm-6">
                 <input type="text" name="surname" placeholder="Фамилия">
            </div>
        </div>

        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Номер: </label>
            <div class="col-sm-6">
                 <input type="number" name="number" placeholder="Номер">
            </div>
        </div>

    <button class="btn btn-primary" type="submit" >Тыкай</button>
</form>

</@c.page>
