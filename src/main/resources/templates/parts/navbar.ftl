<#import "security.ftl" as c>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">Гитарки</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/main">Гитары</a>
            </li>


            <#if c.isAdmin>

                <li class="nav-item">
                    <a class="nav-link" href="/userList">userList</a>
                </li>
            </#if>


            <#if c.user??>
                <li class="nav-item">
                    <a class="nav-link" href="/user">Личный кабинет</a>
                </li>
            </#if>
            <li class="nav-item">
                <a class="nav-link" href="/login">Sign in</a>
            </li>
        </ul>

    </div>
</nav>