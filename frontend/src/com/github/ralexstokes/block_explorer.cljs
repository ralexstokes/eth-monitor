(ns com.github.ralexstokes.block-explorer)

(defn network->beaconchain-prefix [network]
  (case network
    "mainnet" ""
    (str network ".")))

(defn link-to-slot [network slot]
  (str "https://"
       (network->beaconchain-prefix network)
       "beaconcha.in/block/"
       slot))

(defn link-to-block [network root]
  (str "https://"
       (network->beaconchain-prefix network)
       "beaconcha.in/block/"
       (subs root 2)))

(defn link-to-epoch [network epoch]
  (str "https://"
       (network->beaconchain-prefix network)
       "beaconcha.in/epoch/"
       epoch))
