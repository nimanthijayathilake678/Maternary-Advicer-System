package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Nutrition;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Life_Style;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Family_Nutrition_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Life_Style_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class C_Life_Style_Service_Impl implements C_Life_Style_Service{
    @Autowired
    C_Life_Style_Repository c_life_style_repository;


    @Override
    public void saveLifeStyleDetails(C_Life_Style life_style) {
        c_life_style_repository.save(life_style);
    }

    @Override
    public List<C_Life_Style> getAllCoupleLifeStyleDetails() {
        return c_life_style_repository.findAll();
    }

    @Override
    public C_Life_Style getLifeStyleDetailsById(Long id) {
        return c_life_style_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateLifeStyleDetails(C_Life_Style updateCoupleLifeStyleDetails, Long id) {
        Optional<C_Life_Style> c_life_style_optional =  c_life_style_repository.findById(id);
        if(c_life_style_optional.isPresent()){
            C_Life_Style c_life_style_To_Update = c_life_style_optional.get();
            c_life_style_To_Update.setW_useCigarettesBetelLeavesTobaco(updateCoupleLifeStyleDetails.isW_useCigarettesBetelLeavesTobaco());
            c_life_style_To_Update.setW_useLiquor(updateCoupleLifeStyleDetails.isW_useLiquor());
            c_life_style_To_Update.setW_useDrugs(updateCoupleLifeStyleDetails.isW_useDrugs());
            c_life_style_To_Update.setW_hangoutWithSmokingPeople(updateCoupleLifeStyleDetails.isW_hangoutWithSmokingPeople());
            c_life_style_To_Update.setW_atmosphereNotPhysicallyMentalyAbusive(updateCoupleLifeStyleDetails.isW_atmosphereNotPhysicallyMentalyAbusive());
            c_life_style_To_Update.setW_dailyReligiousRitual(updateCoupleLifeStyleDetails.isW_dailyReligiousRitual());
            c_life_style_To_Update.setW_regularExercise(updateCoupleLifeStyleDetails.isW_regularExercise());
            c_life_style_To_Update.setW_timeForHobbies(updateCoupleLifeStyleDetails.isW_timeForHobbies());
            c_life_style_To_Update.setH_useCigarettesBetelLeavesTobaco(updateCoupleLifeStyleDetails.isH_useCigarettesBetelLeavesTobaco());
            c_life_style_To_Update.setH_useLiquor(updateCoupleLifeStyleDetails.isH_useLiquor());
            c_life_style_To_Update.setH_useDrugs(updateCoupleLifeStyleDetails.isH_useDrugs());
            c_life_style_To_Update.setH_hangoutWithSmokingPeople(updateCoupleLifeStyleDetails.isH_hangoutWithSmokingPeople());
            c_life_style_To_Update.setH_atmosphereNotPhysicallyMentalyAbusive(updateCoupleLifeStyleDetails.isH_atmosphereNotPhysicallyMentalyAbusive());
            c_life_style_To_Update.setH_dailyReligiousRitual(updateCoupleLifeStyleDetails.isH_dailyReligiousRitual());
            c_life_style_To_Update.setH_regularExercise(updateCoupleLifeStyleDetails.isH_regularExercise());
            c_life_style_To_Update.setH_timeForHobbies(updateCoupleLifeStyleDetails.isH_timeForHobbies());
            return true;
        }
        return false;

    }
}
