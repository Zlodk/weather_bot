
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.
        a: хули

    state: Hello
        # q!: $regex</hello>
        intent!: /hello
        a: Привет, пользователь

    state: Weather
        intent!: /weather
        a: Сегодня солнечная погода

    state: Currency
        intent!: /currency
        a: Я пока не умею выдавать курс валют

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}