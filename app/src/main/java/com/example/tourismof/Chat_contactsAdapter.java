package com.example.tourismof;


import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

//
//public class Chat_contactsAdapter extends RecyclerView.Adapter<Chat_contactsAdapter.ContactsViewHolder> {
//
//
//    private List<Contacts> userName_list;
//    private FirebaseAuth mAuth;
//    private DatabaseReference userDatabaseRef;
//
//
//
//
//    public Chat_contactsAdapter(List<Contacts> userName_list)
//    {
//        this.userName_list = userName_list;
//    }
//
//    public class ContactsViewHolder extends RecyclerView.ViewHolder {
//
//
//
//        public TextView User_name;
//        public ImageView imageView;
//
//        public ContactsViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            User_name = itemView.findViewById(R.id.usercontact_name);
//            imageView = itemView.findViewById(R.id.User_contact_image);
//        }
//    }
//
//    @NonNull
//    @Override
//    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        View v = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.all_cotacts_layout, parent, false);
//
//        mAuth = FirebaseAuth.getInstance();
//        return new ContactsViewHolder(v);
//
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull final ContactsViewHolder holder, int position) {
//
//        String message_senderID = mAuth.getCurrentUser().getUid();
//        Messages messages = userMessages_list.get(position);
//
//        String fromUserID = messages.getFrom();
//        String typeMessage = messages.getType();
//
//        userDatabaseRef = FirebaseDatabase.getInstance().getReference().child("Users").child(fromUserID);
//        userDatabaseRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                if(dataSnapshot.exists()){
//                    String image = dataSnapshot.child("Profile").getValue().toString();
//                    Picasso.get().load(image).into(holder.receiver_image);
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//        if(typeMessage.equals("text")){
//            holder.receiver_message_text.setVisibility(View.INVISIBLE);
//            holder.receiver_image.setVisibility(View.INVISIBLE);
//
//            if(fromUserID.equals(message_senderID)){
//                holder.sender_message_text.setBackgroundResource(R.drawable.sender_message_text_background);
//                holder.sender_message_text.setTextColor(Color.WHITE);
//                holder.sender_message_text.setGravity(Gravity.LEFT);
//                holder.sender_message_text.setText(messages.getMessage());
//            }
//            else
//            {
//                holder.sender_message_text.setVisibility(View.INVISIBLE);
//
//                holder.receiver_message_text.setVisibility(View.VISIBLE);
//                holder.receiver_image.setVisibility(View.VISIBLE);
//
//                holder.receiver_message_text.setBackgroundResource(R.drawable.receiver_message_text_backgrount);
//                holder.receiver_message_text.setTextColor(Color.WHITE);
//                holder.receiver_message_text.setGravity(Gravity.LEFT);
//                holder.receiver_message_text.setText(messages.getMessage());
//            }
//        }
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return userMessages_list.size();
//    }
//}




public class Chat_contactsAdapter extends RecyclerView.Adapter<Chat_contactsAdapter.contactsViewHolder>{


    private List<Contacts> userContactlist;
    private FirebaseAuth mAuth;
    private DatabaseReference userDatabaseRef;


    public Chat_contactsAdapter(List<Contacts> userContactlist)
    {
        this.userContactlist = userContactlist;
    }


    @NonNull
    @Override
    public Chat_contactsAdapter.contactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.all_cotacts_layout,parent,false);

        mAuth = FirebaseAuth.getInstance();

        return new contactsViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull Chat_contactsAdapter.contactsViewHolder holder, int position) {


        String currentUID = mAuth.getCurrentUser().getUid();

        Contacts contacts = userContactlist.get(position);


    }


    public class contactsViewHolder extends RecyclerView.ViewHolder {

        public TextView User_name_contact;
        public ImageView user_image_Contact;


        public contactsViewHolder(@NonNull View itemView) {
            super(itemView);

            User_name_contact = itemView.findViewById(R.id.usercontact_name);
            user_image_Contact = itemView.findViewById(R.id.User_contact_image);
        }
    }


    @Override
    public int getItemCount() {
        return 0;
    }
}