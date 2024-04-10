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
            c_life_style_To_Update.setGender(updateCoupleLifeStyleDetails.getGender());
            c_life_style_To_Update.setUseCigarettesBetelLeavesTobaco(updateCoupleLifeStyleDetails.isUseCigarettesBetelLeavesTobaco());
            c_life_style_To_Update.setUseLiquor(updateCoupleLifeStyleDetails.isUseLiquor());
            c_life_style_To_Update.setUseDrugs(updateCoupleLifeStyleDetails.isUseDrugs());
            c_life_style_To_Update.setHangoutWithSmokingPeople(updateCoupleLifeStyleDetails.isHangoutWithSmokingPeople());
            c_life_style_To_Update.setAtmosphereNotPhysicallyMentalyAbusive(updateCoupleLifeStyleDetails.isAtmosphereNotPhysicallyMentalyAbusive());
            c_life_style_To_Update.setDailyReligiousRitual(updateCoupleLifeStyleDetails.isDailyReligiousRitual());
            c_life_style_To_Update.setRegularExercise(updateCoupleLifeStyleDetails.isRegularExercise());
            c_life_style_To_Update.setTimeForHobbies(updateCoupleLifeStyleDetails.isTimeForHobbies());

            return true;
        }
        return false;

    }
}
