package com.csc131.deltamedicalteam.ui.profile;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.csc131.deltamedicalteam.R;
import com.csc131.deltamedicalteam.model.Patient;

public class ProfilePatientFragment extends Fragment {
    private com.csc131.deltamedicalteam.databinding.FragmentProfilePatientBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = com.csc131.deltamedicalteam.databinding.FragmentProfilePatientBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Retrieve the passed patient information
        ProfilePatientFragmentArgs args = ProfilePatientFragmentArgs.fromBundle(getArguments());
        Patient patient = args.getPatient();

        // Display the patient information
        TextView nameTextView = view.findViewById(R.id.profile_name);
        TextView emailTextView = view.findViewById(R.id.profile_email);
        TextView phoneTextView = view.findViewById(R.id.patient_cellPhone);
        TextView dobTextView = view.findViewById(R.id.patient_dob);
        TextView martialTextView = view.findViewById(R.id.patient_martialStatus);
        TextView addressTextView = view.findViewById(R.id.profile_address);
       TextView emergencyContactTextView = view.findViewById(R.id.patient_emergencyName);
       TextView emergencyNumTextView = view.findViewById(R.id.patient_emergencyPhone);
        TextView bloodGroupTextView = view.findViewById(R.id.patient_bloodGroup);
        // Add more TextViews for other patient information

        if (nameTextView != null) {
            nameTextView.setText(patient.getName());
        } else {
            Log.e("TextView Error", "nameTextView is null");
        }
        if (emailTextView != null) {
            emailTextView.setText(patient.getEmail());
        } else {
            Log.e("TextView Error", "emailTextView is null");
        }
        if (phoneTextView != null) {
            phoneTextView.setText(patient.getCellPhone());
        } else {
            Log.e("TextView Error", "phoneTextView is null");
        }
        if (dobTextView != null) {
            dobTextView.setText(patient.getDob());
        } else {
            Log.e("TextView Error", "dobTextView is null");
        }
        if (martialTextView != null) {
            martialTextView.setText(patient.getMaritalStatus());
        } else {
            Log.e("TextView Error", "martialTextView is null");
        }
        if (addressTextView != null) {
            addressTextView.setText(patient.getAddress());
        }
        else {
            Log.e("TextView Error", "addressTextView is null");
        }
        if (emergencyContactTextView != null) {
           emergencyContactTextView.setText(patient.getEmergencyName());
        } else {
            Log.e("TextView Error", "emergencyContactTextView is null");
        }

        if (emergencyNumTextView != null) {
          emergencyNumTextView.setText(patient.getEmergencyPhone());
        } else {
           Log.e("TextView Error", "emergencyNumTextView is null");
        }
        if (bloodGroupTextView != null) {
            bloodGroupTextView.setText(patient.getBloodGroup());
        } else {
            Log.e("TextView Error", "bloodGroupTextView is null");
        }
// BUTTON CODE
    //    ImageButton editEmailButton = view.findViewById(R.id.edit_email_btn);
     //   ImageButton editPhoneButton = view.findViewById(R.id.edit_phone_btn);

     //   editEmailButton.setOnClickListener(v -> showEditDialog("Email", patient.getEmail(), emailTextView));
       // editPhoneButton.setOnClickListener(v -> showEditDialog("Phone", user.getPhone(), phoneTextView));
       // private void showEditDialog(String aff, String currentValue, TextView textView) {
      //      AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
      //      builder.setTitle("Edit " + aff);

            // Create an EditText for editing the value
         //   final EditText editText = new EditText(requireContext());
      //      editText.setText(currentValue);
      //      builder.setView(editText);

            // Set up the buttons
       //     builder.setPositiveButton("Save", (dialog, which) -> {
      //          String newValue = editText.getText().toString().trim();
       //         textView.setText(newValue);
                // You can perform further actions here, like updating the user object
                // with the new value and saving it to a database, etc.
       //     });
       //     builder.setNegativeButton("Cancel", (dialog, which) -> dialog.cancel());

       //     builder.show();
        }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}