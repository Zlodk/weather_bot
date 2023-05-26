
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.
        a: хули

    state: Hello
#        intent!: $regex</hello>
        q!: $regex</hello>
        a: Привет привет

    state: Weather
        intent!: /пока
        a: Пока пока

    state: Currency
        intent!: /currency
        a: Я не понял. Вы сказали: {{$request.query}}

    state: NoMatch
        event!: /NoMatch
        a: Я не понял. Вы сказали: {{$request.query}}