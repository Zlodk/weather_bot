require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    #state: Hello
    #    intent!: /привет
    #    a: Привет привет
    
    state: Bye
        intent!: /пока
        a: Пока пока

    state: /hello
        q!: * (привет/здравствуй*/добрый (~утро/~вечер/~день/~ночь)) *
        random:
            a: Добрый день!
            a: Здравствуйте!
            a: Приветствую.
            
    state: /weather
        q!: * погод* *
        random:
            a: Солнечно
            a: Пасмурно
            a: Дождливо
            
    state: /currency
        q!: * *курс* *
        random:
            a: 100
            a: 1
            a: 33

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    # state: Match
    #     event!: match
    #   a: {{$context.intent.answer}}