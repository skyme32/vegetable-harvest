import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.espresso.matcher.ViewMatchers.assertThat
import androidx.test.filters.SmallTest
import com.google.common.truth.Truth.assertThat
import com.skyme32.vegetabllance.data.local.datasource.AppDatabase
import com.skyme32.vegetabllance.data.local.datasource.VegetableDao
import com.skyme32.vegetabllance.data.local.model.Season
import com.skyme32.vegetabllance.data.local.model.Vegetable
import com.skyme32.vegetabllance.getOrAwaitValue
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.hamcrest.CoreMatchers.equalTo
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject
import javax.inject.Named

@ExperimentalCoroutinesApi
@SmallTest
@HiltAndroidTest
class VegetableDaoTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Inject
    @Named("test_db")
    lateinit var database: AppDatabase
    private lateinit var dao: VegetableDao

    @Before
    fun setup() {
        hiltRule.inject()
        dao = database.vegetableDao()
    }

    @After
    fun teardown() {
        database.close()
    }

    @Test
    fun insertVegetableItem() = runBlocking {

        val vegetableItem = Vegetable(1, true, "advocado")
        dao.insertOrUpdateVegetable(vegetableItem)

        val allVegetables = dao.getAllVegetables().getOrAwaitValue()

        assertThat(allVegetables).contains(vegetableItem)
    }

    /*
    @Test
    fun insertAndGetAllVegetables() = runBlocking {
        // Given
        val vegetable = Vegetable(/* Initialize Vegetable object */)
        val season = Season(/* Initialize Season object */)
        vegetableDao.insertOrUpdateVegetable(vegetable)
        vegetableDao.insertOrUpdateSeason(season)

        // When


        // Then
        // Write assertions to verify the result
    }

     */
}