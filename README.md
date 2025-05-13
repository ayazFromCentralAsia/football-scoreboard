# Football World Cup Scoreboard

## Описание

Простая Java-библиотека для отслеживания матчей Чемпионата мира по футболу: начало игры, обновление счёта, завершение и сводка.

## Функции

- Начать игру
- Завершить игру
- Обновить счёт
- Получить сводку по матчам, отсортированную по убыванию суммы голов

## Установка

Скопируйте исходный код в свой проект. Библиотека не требует внешних зависимостей.

## Пример использования

```java
Scoreboard scoreboard = new Scoreboard();

Game game1 = scoreboard.startGame("Spain", "Brazil");
scoreboard.updateScore(game1, 2, 2);

Game game2 = scoreboard.startGame("Germany", "France");
scoreboard.updateScore(game2, 3, 1);

List<Game> summary = scoreboard.getSummary();
for (Game game : summary) {
    System.out.println(game);
}
