import UIKit
import Mapbox

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()

        title = "MapLibre"
        
        // construct style URL
        let styleURL = URL(string: "https://demotiles.maplibre.org/style.json")
        
        // create the map view
        let mapView = MGLMapView(frame: view.bounds, styleURL: styleURL)
        mapView.autoresizingMask = [.flexibleWidth, .flexibleHeight]
        mapView.logoView.isHidden = true

        // add the mapview to the view
        view.addSubview(mapView)
    }
}

