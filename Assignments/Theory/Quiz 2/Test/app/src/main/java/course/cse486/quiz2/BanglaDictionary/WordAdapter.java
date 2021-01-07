package course.cse486.quiz2.BanglaDictionary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.ViewHolder> {

    Context context;
    LayoutInflater layoutInflater;

    private List<Word> wordList;

    public WordAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    public void setWordList(List<Word> wordList) {
        this.wordList = wordList;
        notifyDataSetChanged();
    }

    public Word getVocabulary(int position) {
        return wordList.get(position);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.vocabulary, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (wordList != null) {
            Word word = wordList.get(position);

            holder.mEnglish.setText(word.getEnglishWord());
        }
    }

    @Override
    public int getItemCount() {
        if (wordList != null) {
            return wordList.size();
        } else {
            return 0;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView mEnglish;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mEnglish = itemView.findViewById(R.id.tv_english);
        }
    }
}
