//Задание:
//Необходимо написать программу – розыгрыша игрушек в магазине детских товаров.
//Желательный функционал программы:
//В программе должен быть минимум один класс со следующими свойствами:
//  id игрушки,
//  текстовое название,
//  количество
//  частота выпадения игрушки (вес в % от 100)
//Метод добавление новых игрушек и возможность изменения веса (частоты выпадения игрушки)
//Возможность организовать розыгрыш игрушек.
//Например, следующим образом:
//С помощью метода выбора призовой игрушки – мы получаем эту призовую игрушку и записываем в список\массив.
//Это список призовых игрушек, которые ожидают выдачи.
//Еще у нас должен быть метод – получения призовой игрушки.
//После его вызова – мы удаляем из списка\массива первую игрушку и сдвигаем массив. А эту игрушку записываем в текстовый файл.
//Не забываем уменьшить количество игрушек

public class Main {
    public static void main(String[] args) {
        Raffle raffle = new Raffle();

        Toy toy1 = new Toy(1, "Конструктор", 5, 20);
        Toy toy2 = new Toy(2, "Робот", 3, 30);
        Toy toy3 = new Toy(3, "Кукла", 10, 50);

        raffle.addToy(toy1);
        raffle.addToy(toy2);
        raffle.addToy(toy3);

        raffle.rewardPrizeToy();

    }
}
