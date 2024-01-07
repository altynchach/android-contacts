package ru.yandex.practicum.contacts.presentation.base;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import java.util.List;
import ru.yandex.practicum.contacts.presentation.base.ListDiffInterface;

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T> {

    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        // Используем метод theSameAs из интерфейса ListDiffInterface для сравнения элементов
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        // Используем equals для сравнения содержимого элементов
        return oldItem.equals(newItem);
    }

    @Override
    public Object getChangePayload(@NonNull T oldItem, @NonNull T newItem) {
        // В качестве payload возвращаем новый элемент, который может использоваться для определения конкретных изменений
        return newItem;
    }
}
