# Задание пятого семинара
>*Создать информационную систему позволяющую работать с cтудентами вуза*
>>**Основные изменения - полная декомпозиция модели [Model](Seminar5/Core/Model), 
>> отедльно "вытащины следующие интерфейсы [Interfaces](Seminar5/Infrasructure/Interfaces)**
>> * Интерфейс позволяющий выдать диплом [DiplomaGetter](Seminar5/Infrasructure/Interfaces/DiplomaGetter.java)
>> * Интерфейс позволяющий выдать преподавателя по специализации
>> или студента по номеру айди [GetElement](Seminar5/Infrasructure/Interfaces/GetElement.java) - измения были для класса 
>> [StudyGroup](Seminar5/Infrasructure/People/StudyGroup.java)
>> * Интерфейс для добавления студента/преподавателя [ThatAdds](Seminar5/Infrasructure/Interfaces/ThatAdds.java)
>> * Интерфейс для работы с файлами [WorkerWithFile](Seminar5/Infrasructure/Interfaces/WorkerWithFile.java)
>> * Интерфейс для работы с блоком предметов [WorkWithSubj](Seminar5/Infrasructure/Interfaces/WorkWithSubj.java)
